package topics.creational.factory.factoryObject;

public class Server implements Computer {
    private String RAM;
    private String HDD;
    private String CPU;

    public  Server(String RAM, String HDD, String CPU){
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }

    @Override
    public void printConfig() {
        System.out.println("RAM: "+this.RAM+ " HDD: "+this.HDD+ " CPU: "+this.CPU);
    }
}
