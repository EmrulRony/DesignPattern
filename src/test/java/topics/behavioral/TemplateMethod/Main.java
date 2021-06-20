package topics.behavioral.TemplateMethod;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\nRecipe for Spaghetti Meatball \n\n");
        PastaDish spaghettiMeatballs = new SpaghettiMeatballs();
        spaghettiMeatballs.makeRecipe();

        System.out.println("\n \nRecipe for Penne Alfredo \n\n");
        PenneAlfredo penneAlfredo = new PenneAlfredo();
        penneAlfredo.makeRecipe();

    }
}
