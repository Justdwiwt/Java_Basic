package test_05_28;

public class Day07Test4 {
}

class Account {
    private long id;
    private double balance;
    private String password;

    public Account(long id, double balance, String password) {
        this.id = id;
        this.balance = balance;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return null;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(long id, double balance, String password, double interestRate) {
        super(id, balance, password);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

class CreditAccount extends Account {
    private double creditLine;

    public CreditAccount(long id, double balance, String password, double creditLine) {
        super(id, balance, password);
        this.creditLine = creditLine;
    }

    public double getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(double creditLine) {
        this.creditLine = creditLine;
    }
}