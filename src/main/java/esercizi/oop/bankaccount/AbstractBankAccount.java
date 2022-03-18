package esercizi.oop.bankaccount;

public abstract class AbstractBankAccount implements BankAccount {
    String IBAN;
    double balance;

    public AbstractBankAccount(String IBAN, double balance) {
        this.IBAN = IBAN;
        this.balance = balance;
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public String getCountry() {
        return null;
    }
}
