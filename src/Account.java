public class Account {
    private int accountNumber; // Номер счета
    private double balance;    // Баланс счета

    // Конструктор
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Геттеры и сеттеры
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        balance += amount;
    }

    // Метод для снятия средств
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    // Переопределение метода toString для удобного вывода
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
