public class Bank {
    private Command OpenAccount;
    private Command CloseAccount;

    public Bank(Command OpenAccount, Command CloseAccount) {
        this.OpenAccount = OpenAccount;
        this.CloseAccount = CloseAccount;
    }

    public void ClickOpen(){
        System.out.println("Open Account Button Clicked");
        OpenAccount.execute();
    }

    public void ClickClose(){
        System.out.println("Close Account Button Clicked");
        CloseAccount.execute();
    }
}
