public class SavingAccount extends Account {

    public SavingAccount(int accountNumber, String firstName, String lastName, int accountAmount) {
        super(accountNumber, firstName, lastName, accountAmount, "Сберегательный");
    }

    @Override
    public void pay(int amount) {
        System.out.println("Аккаунт [" + accountType + " - " + accountNumber + "]. Попытка оплаты -$" + amount);
        System.out.println("ОШИБКА: Со сберегательного счета нельзя платить.");
    }

    @Override
    protected boolean validateAdd(int amount) {
        // нет требований добавления для cберегательного счета
        return true;
    }

    @Override
    protected boolean validatePay(int amount) {
        if (accountAmount - amount < 0) {
            System.out.println("ОШИБКА: Расчетный счет не может уходить в минус.");
            return false;
        }
        return true;
    }
}
