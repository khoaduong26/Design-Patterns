public class App {
    public static void main(String[] args) throws Exception {
        Payment momo = PaymentFactory.getPayment(new MoMoFactory());
        System.out.println(momo.pay());

        Payment zalo = PaymentFactory.getPayment(new ZaloPayFactory());
        System.out.println(zalo.pay());

        Payment vnpay = PaymentFactory.getPayment(new VNPayFactory());
        System.out.println(vnpay.pay());
    }
}
