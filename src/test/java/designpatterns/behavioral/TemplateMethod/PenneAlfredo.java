package designpatterns.behavioral.TemplateMethod;

public class PenneAlfredo extends PastaDish{
    @Override
    void addPasta() {
        System.out.println("Adding penne...");
    }

    @Override
    void addSauce() {
        System.out.println("Adding alfredo sauce...");
    }

    @Override
    void addProtein() {
        System.out.println("Adding chicken");
    }

    @Override
    void addGarnish() {
        System.out.println("Adding parsley");
    }
}
