package ConcreteObserver;

import model.LoginStatus;
import model.User;
import Observer.Observer;

public class Mailer implements Observer {
    @Override
    public void update(User user) {
        if(user.getLoginStatus() == LoginStatus.EXPIRED) {
            System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
        }
    }
}
