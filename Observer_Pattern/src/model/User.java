package model;

public class User {
    private String email;
    private String ip;
    private LoginStatus loginStatus;
    public User() {
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public LoginStatus getLoginStatus() {
        return loginStatus;
    }
    public void setLoginStatus(LoginStatus loginStatus) {
        this.loginStatus = loginStatus;
    }
    
    @Override
    public String toString() {
        return "User [email=" + email + ", ip=" + ip + ", loginStatus=" + loginStatus + "]";
    }
}
