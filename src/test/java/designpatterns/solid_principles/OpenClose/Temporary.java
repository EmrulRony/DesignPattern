package designpatterns.solid_principles.OpenClose;

public class Temporary extends Employee{
    private String empType;
    public Temporary(int empId, String empName, String empType){
        super(empId, empName);
        this.empType = empType;
    }
    @Override
    public double getBonus(double salary) {
        return salary * 1.0;
    }
}
