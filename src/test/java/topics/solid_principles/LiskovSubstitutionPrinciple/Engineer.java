package topics.solid_principles.LiskovSubstitutionPrinciple;

public class Engineer implements AdminEmployee{
    int empId;
    String empName;
    double empSalary = 40000;

    public Engineer(int empId, String empName){
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

    @Override
    public void printAuthorization() {
        System.out.println("Engineer can lookup any his/her own info");
    }
}
