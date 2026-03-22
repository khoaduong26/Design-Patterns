public class TaxStrategyUS implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        // Tính thuế ở Mỹ là 10% 
        return amount * 0.10;
    }
}
