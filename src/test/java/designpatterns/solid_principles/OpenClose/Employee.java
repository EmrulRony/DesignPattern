package designpatterns.solid_principles.OpenClose;

public abstract class Employee {
    private int empId;
    private String empName;

    public Employee(){

    }

    public Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    public abstract double getBonus(double salary);

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}