package designpatterns.solid_principles.OpenClose;

public class Engineer extends Employee{
    private String empType;
    public Engineer(int empId, String empName, String empType){
        super(empId, empName);
        this.empType = empType;
    }
    @Override
    public double getBonus(double salary) {
        return salary * 1.5;
    }
}
