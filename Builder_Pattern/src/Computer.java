public class Computer {
    private String Cpu;
    private String Ram;
    private String Storage;
    private String Gpu;
    public Computer() {
    }
    
    public Computer(Computer computer) {
        this.Cpu = computer.Cpu;
        this.Ram = computer.Ram;
        this.Storage = computer.Storage;
        this.Gpu = computer.Gpu;
    }
    public void setCpu(String cpu) {
        this.Cpu = cpu;
    }
    public void setRam(String ram) {
        this.Ram = ram;
    }
    public void setStorage(String storage) {
        this.Storage = storage;
    }
    public void setGpu(String gpu) {
        this.Gpu = gpu;
    }
    @Override
    public String toString() {
        return "Computer Component\n" +
           "   CPU     : " + Cpu + "\n" +
           "   RAM     : " + Ram + "\n" +
           "   Storage : " + Storage + "\n" +
           "   GPU     : " + Gpu + "\n";
    }
}
