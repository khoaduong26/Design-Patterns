public class ZaloPayFactory implements PaymentAbstractFactory {

    @Override
    public Payment createPayment() {
        return new ZaloPayPayment();
    }

}