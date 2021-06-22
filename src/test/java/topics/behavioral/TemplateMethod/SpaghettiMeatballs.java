package topics.behavioral.TemplateMethod;

public class SpaghettiMeatballs extends PastaDish{
    @Override
    void addPasta() {
        System.out.println("Adding spaghetti...");
    }

    @Override
    void addSauce() {
        System.out.println("Adding tomato sauce...");
    }

    @Override
    void addProtein() {
        System.out.println("Adding meatball...");
    }

    @Override
    void addGarnish() {
        System.out.println("Adding Parmesan cheese");
    }
}
