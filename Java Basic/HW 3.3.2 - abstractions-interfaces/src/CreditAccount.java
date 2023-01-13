public class CreditAccount extends Account {
    public CreditAccount(int accountNumber, String firstName, String lastName, int accountAmount) {
        super(accountNumber, firstName, lastName, accountAmount, "Кредитный");
    }

    @Override
    protected boolean validateAdd(int amount) {
        if (accountAmount + amount > 0) {
            System.out.println("ОШИБКА: Кредитный счет не может уходить в плюс.");
            return false;
        }
        return true;
    }

    @Override
    protected boolean validatePay(int amount) {
        // нет требований добавления для кредитного счета
        return true;
    }
}
