public class CheckingAccount extends Account {

    public CheckingAccount(int accountNumber, String firstName, String lastName, int accountAmount) {
        super(accountNumber, firstName, lastName, accountAmount, "Расчетный");
    }

    @Override
    protected boolean validateAdd(int amount) {
        // нет требований добавления для расчетного счета
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
