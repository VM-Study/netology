abstract public class Account {
    long accountNumber;
    String firstName;
    String lastName;
    int accountAmount;
    String accountType;

    public Account(int accountNumber, String firstName, String lastName, int accountAmount, String accountType) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountAmount = accountAmount;
        this.accountType = accountType;
    }

    public void pay(int amount) {
        System.out.println("Аккаунт [" + accountType + " - " + accountNumber + "]. Попытка оплаты -$" + amount);
        if (this.validatePay(amount)) {
            this.transactionPayMoney(amount);
        }
    }

    private void transactionPayMoney(int amount) {
        accountAmount -= amount;
        System.out.println("Аккаунт [" + accountType + " - " + accountNumber + "]. Списано: -$" + amount + ". Баланс: $" + accountAmount);
    }

    public void addMoney(int amount) {
        System.out.println("Аккаунт [" + accountType + " - " + accountNumber + "]. Попытка зачисления +$" + amount);
        if (this.validateAdd(amount)) {
            this.transactionAddMoney(amount);
        }
    }

    private void transactionAddMoney(int amount) {
        accountAmount += amount;
        System.out.println("Аккаунт [" + accountType + " - " + accountNumber + "]. Зачислено: +$" + amount + ". Баланс: $" + accountAmount);
    }

    public void transfer(Account account, int amount) {
        System.out.println("Аккаунт [" + accountType + " - " + accountNumber + "]. Попытка перевода $" + amount + " на аккаунт [" + account.accountType + " - " + account.accountNumber + "]");
        if (this.validatePay(amount) && account.validateAdd(amount)) {
            this.transactionTransferMoney(account, amount);
        }
    }

    private void transactionTransferMoney(Account account, int amount) {
        transactionPayMoney(amount);
        account.transactionAddMoney(amount);
    }


    protected abstract boolean validateAdd(int amount);

    protected abstract boolean validatePay(int amount);

    @Override
    public String toString() {
        return "" + accountNumber;
    }
}
