public class Lab {
    private String labID;
    private LabStatus status;

    public Computer[] computers;

    private Employee labAttendent;

    private int currentComp = 0;
    private int maxComp = 5;

    public Lab(String labID, LabStatus status, Employee labAttendent) {
        this.labID = labID;
        this.status = status;
        computers = new Computer[maxComp];
        this.labAttendent = labAttendent;
    }

    public void addComputer(Computer computer){
        if (currentComp < maxComp){
            computers[currentComp++] = computer;
        }
    }

    public boolean removeComputer(String computerNumber){
        int i = 0;
        for (Computer comp : computers){
            if (comp.getComputerNumber().equals(computerNumber)){
                for (int j = i; j<currentComp;){
                    computers[j++] = computers[j+1];
                computers[--currentComp] = null;
                i++;
                return true;
            }
        }
            i++;
    }
        return false;
    }

    public Computer fetch(String computerNumber){
        for (Computer comp : computers){
            if (comp.getComputerNumber().equals(computerNumber)){
                return comp;
            }
        }
        return null;
    }
}
