public class Main {
    public static void main(String[] args) {
        // Создаем счета
        Account account1 = new Account(101, 5000);
        Account account2 = new Account(102, 10000);

        // Создаем клиентов
        Customer customer1 = new Customer("Alice", "alice@example.com", account1);
        Customer customer2 = new Customer("Bob", "bob@example.com", account2);

        // Создаем банк
        Bank bank = new Bank("MyBank");

        // Добавляем клиентов в банк
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Отображаем клиентов банка
        bank.displayCustomers();

        // Выполняем операции с клиентскими счетами
        account1.deposit(2000);
        account2.withdraw(3000);

        // Сравниваем счета
        System.out.println("Обновленная информация о счетах:");
        System.out.println(account1);
        System.out.println(account2);
    }
}