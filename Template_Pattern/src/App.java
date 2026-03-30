public class App {
    public static void main(String[] args) throws Exception {
        Beverage coffee = new Coffee();
        coffee.makeBeverage();

        System.out.println("-----");

        Beverage tea = new Tea();
        tea.makeBeverage();
    }
}
