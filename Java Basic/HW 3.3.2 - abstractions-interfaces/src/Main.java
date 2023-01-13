public class Main {
    public static void main(String[] args) {
        Account accountChecking = new CheckingAccount( 55611411, "Petya", "Grum", 10000);
        Account accountCredit = new CreditAccount(55611334, "Vasya", "Morkin", -3500);
        Account accountSaving = new SavingAccount(55611221, "Ivan", "Dron", 10000);

        accountChecking.addMoney(50000);
        System.out.println();
        accountChecking.pay(15000);
        System.out.println();
        accountChecking.transfer(accountCredit,10000);
        System.out.println();

        accountCredit.addMoney(4000);
        System.out.println();
        accountCredit.pay(800);
        System.out.println();
        accountCredit.transfer(accountSaving, 95000);
        System.out.println();

        accountSaving.addMoney(1000);
        System.out.println();
        accountSaving.pay(1400);
        System.out.println();
        accountSaving.transfer(accountChecking, 450);
    }
}
