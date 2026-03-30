public class App {
    public static void main(String[] args) throws Exception {
        LightSwitch light = new LightSwitch();
        light.press(); // bật
        light.press(); // tắt
        light.press(); // bật
    }
}
