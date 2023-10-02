import java.util.Objects;

public class Computer {
    private String computerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    public Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGPU) {
        setComputerNumber(computerNumber);
        setLcdModel(lcdModel);
        setRamSize(ramSize);
        setHddSize(hddSize);
        setHasGPU(hasGPU);
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getLcdModel() {
        return lcdModel;
    }

    public void setLcdModel(String lcdModel) {
        this.lcdModel = lcdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    @Override
    public boolean equals(Object o) {
        Computer c = (Computer) o;
        return ramSize == c.ramSize && hddSize == c.hddSize && hasGPU == c.hasGPU && computerNumber.equals(c.computerNumber) && lcdModel.equals(c.lcdModel);
    }

    public static Computer clone(Computer comp){
        return new Computer(comp.getComputerNumber(), comp.getLcdModel(), comp.getRamSize(), comp.getHddSize(), comp.isHasGPU());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerNumber='" + computerNumber + '\'' +
                ", lcdModel='" + lcdModel + '\'' +
                ", ramSize=" + ramSize +
                ", hddSize=" + hddSize +
                ", hasGPU=" + hasGPU +
                '}';
    }
}
