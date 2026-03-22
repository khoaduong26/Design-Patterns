public class VNPayFactory implements PaymentAbstractFactory {

    @Override
    public Payment createPayment() {
        return new VNPayPayment();
    }

}