// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    University u1 = new University();
    u1.addLab(new Lab("12",LabStatus.OPERATIONAL,new Employee("12","Hadi")));
    u1.labs[0].addComputer(new Computer("16","4545GAG",12,20,true));
    u1.labs[0].addComputer(new Computer("14","kllGAG",12,20,true));
        System.out.println(u1.labs[0].computers[0]);
        System.out.println(u1.labs[0].computers[1]);
        System.out.println(u1.labs[0].fetch("14"));
        System.out.println(u1.labs[0].removeComputer("16"));
        System.out.println(u1.labs[0].computers[0]);
    }
}