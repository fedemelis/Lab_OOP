package esercizi.oop.bankaccount;

public class BankAccountUnicredit extends AbstractBankAccount{
    double feeDeposit;
    double feeWithdraw;
    double annualInterest;

    public BankAccountUnicredit(String IBAN, double balance) {
        super(IBAN, balance);
    }

    @Override
    public double withdraw(double d) {
        return balance -= d + feeWithdraw;
    }

    @Override
    public void deposit(double d) {
        balance += d - feeDeposit;
    }

    @Override
    public double addAnnualInterest() {
        return balance += annualInterest;
    }

    @Override
    public double transfer(BankAccount b, double d) {
        b.deposit(d);
        return balance -= d;
    }

    @Override
    public String toString() {
        return "BankAccountIntesa{" +
                "feeDeposit=" + feeDeposit +
                ", feeWithdraw=" + feeWithdraw +
                ", annualInterest=" + annualInterest +
                '}';
    }
}
