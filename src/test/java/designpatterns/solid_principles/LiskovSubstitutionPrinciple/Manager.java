package designpatterns.solid_principles.LiskovSubstitutionPrinciple;

public class Manager implements AdminEmployee{
    int empId;
    String empName;
    double empSalary = 80000;

    public Manager(int empId, String empName){
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
        return this.empSalary*0.2;
    }

    @Override
    public void printAuthorization() {
        System.out.println("Manager can lookup any sub-ordinate's info");
    }
}
