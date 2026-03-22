public class ComputerBuilder {
    private Computer computer;

    public ComputerBuilder() {
        this.computer = new Computer();
    }
    
    public ComputerBuilder setCPU(String CPU) {
        computer.setCpu(CPU);
        return this;
    }

    public ComputerBuilder setRAM(String RAM) {
        computer.setRam(RAM);
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    public ComputerBuilder setGPU(String GPU) {
        computer.setGpu(GPU);
        return this;
    }

    public Computer build() {
        return new Computer(this.computer);
    }
}
