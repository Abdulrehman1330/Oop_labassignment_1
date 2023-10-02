public class Employee {
    private String employeeID;
    private String name;
    public static String designation = "Lab Attendant";

    public Employee(String employeeID, String name) {
        setEmployeeID(employeeID);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getDesignation() {
        return designation;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
