public class PaymentFactory {

    public static Payment getPayment(PaymentAbstractFactory factory) {
        return factory.createPayment();
    }
}