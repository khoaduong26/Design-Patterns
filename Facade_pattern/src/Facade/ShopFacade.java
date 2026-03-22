package Facade;

import Service.AccountService;
import Service.EmailService;
import Service.PaymentService;
import Service.ShippingService;
import Service.SmsService;

public class ShopFacade {
    public static final ShopFacade instance = new ShopFacade();

    private AccountService accountService;
    private EmailService emailService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private SmsService smsService;

    private ShopFacade() {
        accountService = new AccountService();
        emailService = new EmailService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        smsService = new SmsService();
    }
    public static ShopFacade getInstance() {
        return instance;
    }

    public void buyProductByCashWithFreeShipping(String mail){
        accountService.getAccount(mail);
        emailService.sendEmail(mail);
        paymentService.PaymentByCash();
        shippingService.freeShipping();
    }

    public void buyProductByCardWithExpressShipping(String mail, String phone){
        accountService.getAccount(mail);
        emailService.sendEmail(mail);
        paymentService.PaymentByCreditCard();
        shippingService.expressShipping();
        smsService.sendSms(phone);
    }
    
}
