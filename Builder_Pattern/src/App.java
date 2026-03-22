public class App {
    public static void main(String[] args) throws Exception {
        Computer myComputer = new ComputerBuilder()
        .setCPU("Intel i7")
        .setGPU("NVIDIA GTX 1660 Ti")
        .setRAM("16GB")
        .setStorage("512GB SSD")
        .build();

        System.out.println(myComputer);
    }
}
