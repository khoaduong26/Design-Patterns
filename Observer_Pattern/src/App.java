import ConcreteObserver.Logger;
import ConcreteObserver.Mailer;
import ConcreteObserver.Protector;
import ConcreteSubject.AccountService;
import model.LoginStatus;

public class App {
    public static void main(String[] args) throws Exception {
        AccountService account1 = createAccount("Khoaduong861@gmail.com", "192.168.123.1");
        account1.login();
        account1.changeStatus(LoginStatus.EXPIRED);
 
        System.out.println("---");
        AccountService account2 = createAccount("DuongKhoa@gmail.com", "116.108.77.231");
        account2.login();
    }

    private static AccountService createAccount(String email, String ip) {
        AccountService account = new AccountService(email, ip);
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Protector());
        return account;
    }
}
