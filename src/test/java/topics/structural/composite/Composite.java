package topics.structural.composite_telescu;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component){
        this.components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println("Component name: "+this.name);
        for (Component component : components){
            component.showPrice();
        }
    }
}
