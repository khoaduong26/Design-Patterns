package ConcreteSubject;
import java.util.ArrayList;
import java.util.List;
import model.*;
import Observer.Observer;
import Subject.Subject;


public class AccountService implements Subject{
    private User user;
    private List<Observer> observers = new ArrayList<>();

    public AccountService(String email, String ip) {
        this.user = new User();
        this.user.setEmail(email);
        this.user.setIp(ip);
    }
    @Override
    public void attach(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }
    @Override
    public void detach(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }
    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(user);
        }
    }
    public void changeStatus(LoginStatus status){
        user.setLoginStatus(status);
        System.out.println("Login status is changed to " + status);
        this.notifyObservers();
    }

    private boolean isValidIp(){
        return "192.168.123.1".equals(user.getIp());
    }
    private boolean isValidEmail(){
        return "Khoaduong861@gmail.com".equalsIgnoreCase(user.getEmail());
    }

    public void login(){
        if(!this.isValidIp()){
            user.setLoginStatus(LoginStatus.INVALID);
        }
        else if(this.isValidEmail()){
            user.setLoginStatus(LoginStatus.SUCCESS);
        }
        else{
            user.setLoginStatus(LoginStatus.FAILURE);
        }
        System.out.println("Login is handled");
        this.notifyObservers();
    }
}
