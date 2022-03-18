package esercizi.oop.bankaccount;

public interface BankAccount {
    String getIBAN();
    String getCountry();
    double withdraw(double d);
    void deposit(double d);
    double addAnnualInterest();
    double transfer(BankAccount b, double d);
}
