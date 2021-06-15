package topics.structural.composite_telescu;

import org.junit.Test;

public class CompositeTest {
    @Test
    public void testComposite(){
        Component hd = new Leaf("ssd", 4000);
        Component mouse = new Leaf("Mouse", 500);
        Component monitor = new Leaf("Monitor", 12000);
        Component ram = new Leaf("RAM", 5000);
        Component cpu = new Leaf("CPU", 28000);

        Composite peripherals = new Composite("Peripherals");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("Mother Board");
        Composite computer = new Composite("Gaming Computer");

        peripherals.addComponent(monitor);
        peripherals.addComponent(mouse);

        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);

        cabinet.addComponent(motherBoard);
        cabinet.addComponent(hd);

        computer.addComponent(peripherals);
        computer.addComponent(cabinet);

        computer.showPrice();


    }
}
