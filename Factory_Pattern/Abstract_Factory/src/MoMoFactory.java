public class MoMoFactory implements PaymentAbstractFactory {

    @Override
    public Payment createPayment() {
        return new MoMoPayment();
    }

}