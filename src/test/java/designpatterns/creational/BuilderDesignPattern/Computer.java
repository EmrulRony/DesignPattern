package designpatterns.creational.BuilderDesignPattern;

public class Computer {
    // required params
    private String HDD;
    private String RAM;
    private String CPU;

    // optional params
    private boolean isGPUEnabled;
    private boolean isThunderboltEnabled;



    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public boolean isGPUEnabled() {
        return isGPUEnabled;
    }

    public boolean isThunderboltEnabled() {
        return isThunderboltEnabled;
    }

    public Computer(ComputerBuilder computerBuilder){
        this.CPU = computerBuilder.CPU;
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isGPUEnabled = computerBuilder.isGPUEnabled;
        this.isThunderboltEnabled = computerBuilder.isGPUEnabled;
    }

    public static class ComputerBuilder {
        // required params
        private String HDD;
        private String RAM;
        private String CPU;

        // optional params
        private boolean isGPUEnabled;
        private boolean isThunderboltEnabled;

        public ComputerBuilder(String HDD, String RAM, String CPU){
            this.HDD = HDD;
            this.RAM = RAM;
            this.CPU = CPU;
        }

        public ComputerBuilder setGPUEnabled(boolean GPUEnabled) {
            isGPUEnabled = GPUEnabled;
            return this;
        }

        public ComputerBuilder setThunderboltEnabled(boolean thunderboltEnabled) {
            isThunderboltEnabled = thunderboltEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "ComputerBuilder{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", CPU='" + CPU + '\'' +
                ", isGPUEnabled=" + isGPUEnabled +
                ", isThunderboltEnabled=" + isThunderboltEnabled +
                '}';
    }


}
