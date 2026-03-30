public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account("khoa");

        Command openAccount = new OpenAccount(account);
        Command closeAccount = new CloseAccount(account);
        Bank bank = new Bank(openAccount, closeAccount);

        bank.ClickOpen();
        bank.ClickClose();
    }
}
