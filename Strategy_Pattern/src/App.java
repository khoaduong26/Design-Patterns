public class App {
    public static void main(String[] args) throws Exception {
        TaxtContext taxtContext = new TaxtContext();

        // Sử dụng chiến lược tính thuế cho Ấn Độ
        taxtContext.setTaxStrategy(new TaxStrategyIndia());
        double taxIndia = taxtContext.calculateTax(1000);
        System.out.println("Tổng số tiền sau thuế ở Ấn Độ: " + taxIndia);

        // Sử dụng chiến lược tính thuế cho Mỹ
        taxtContext.setTaxStrategy(new TaxStrategyUS());
        double taxUS = taxtContext.calculateTax(1000);
        System.out.println("Tổng số tiền sau thuế ở Mỹ: " + taxUS);
    }
}
