package ConcreteObserver;

import model.LoginStatus;
import model.User;
import Observer.Observer;

public class Protector implements Observer{
     @Override
    public void update(User user) {
        if (user.getLoginStatus() == LoginStatus.INVALID) {
            System.out.println("Protector: User " + user.getEmail() + " is invalid. "
                    + "IP " + user.getIp() + " is blocked");
        }
    }
}
