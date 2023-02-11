package designpatterns.solid_principles.LiskovSubstitutionPrinciple;

public class TemporaryEmployee implements Employee {
    int empId;
    String empName;
    double empSalary = 40000;

    public TemporaryEmployee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public void printEmpInfo() {
        System.out.println("Name: "+this.empName);
        System.out.println("ID: "+this.empId);
    }

    @Override
    public double getEmpBonus() {
        return this.empSalary*0.15;
    }

}
