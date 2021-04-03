package topics.creational.BuilderDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB", "8 GB", "Core i5")
                .setGPUEnabled(true)
                .setThunderboltEnabled(true)
                .build();

        System.out.println(computer);
    }
}
