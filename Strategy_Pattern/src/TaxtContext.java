public class TaxtContext {
    private TaxStrategy taxStrategy;

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax(double amount) {
        return amount + taxStrategy.calculateTax(amount);
    }
}
