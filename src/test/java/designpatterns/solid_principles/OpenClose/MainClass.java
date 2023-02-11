package designpatterns.solid_principles.OpenClose;

public class MainClass {
    public static void main(String[] args) {
        Employee manager = new Manager(101, "John Doe", "Manager");
        System.out.println("Name: "+manager.getEmpName());
        System.out.println("Bonus: "+manager.getBonus(50000));
    }
}
