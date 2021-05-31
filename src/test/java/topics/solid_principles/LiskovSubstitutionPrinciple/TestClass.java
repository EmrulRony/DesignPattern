package topics.solid_principles.LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<AdminEmployee> employeeList = new ArrayList<>();
        employeeList.add(new Manager(101, "John"));
        employeeList.add(new Engineer(102,"Jason"));

        for (AdminEmployee employee : employeeList){
            employee.printAuthorization();
        }
    }
}
