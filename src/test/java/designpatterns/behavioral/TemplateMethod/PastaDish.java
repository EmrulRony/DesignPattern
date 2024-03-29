package designpatterns.behavioral.TemplateMethod;

public abstract class PastaDish {
    final void makeRecipe(){
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }

    abstract void addPasta();
    abstract void addSauce();
    abstract void addProtein();
    abstract void addGarnish();

    private void boilWater(){
        System.out.println("Boiling water....");
    }

    private void cookPasta(){
        System.out.println("Cooking....");
    }

    private void drainAndPlate(){
        System.out.println("Drawing and Plating water....");
    }

}
