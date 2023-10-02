public class University {
    public Lab labs[];
    int maxLab = 5;
    int currentLab = 0;
    University(){
        labs = new Lab[maxLab];
    }
    public void addLab(Lab lab){
        if (currentLab < maxLab){
            labs[currentLab++] = lab;
        }
    }


}
