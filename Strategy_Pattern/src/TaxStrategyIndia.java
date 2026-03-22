public class TaxStrategyIndia implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        // Tính thuế ở Ấn Độ là 18%
        return amount * 0.18;
    }
}
