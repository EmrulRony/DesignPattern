package designpatterns.solid_principles.OpenClose;

public class Manager extends Employee{
    private String empType;
    public Manager(int empId, String empName, String empType){
        super(empId, empName);
        this.empType = empType;
    }
    @Override
    public double getBonus(double salary) {
        return salary * .2;
    }
}
