public class Main {
    public static void main(String[] args) {
        // Создаем счета
        Account account1 = new Account(101, 5000);
        Account account2 = new Account(102, 10000);

        // Используем методы Account (геттеры и сеттеры)
        System.out.println("Номер счета первого клиента: " + account1.getAccountNumber());
        System.out.println("Баланс первого счета: " + account1.getBalance());

        // Изменяем значения через сеттеры
        account1.setBalance(6000);
        account2.setAccountNumber(105);

        // Выводим обновленные данные
        System.out.println("Обновленный номер счета второго клиента: " + account2.getAccountNumber());
        System.out.println("Обновленный баланс первого счета: " + account1.getBalance());

        // Создаем клиентов
        Customer customer1 = new Customer("Alice", "alice@example.com", account1);
        Customer customer2 = new Customer("Bob", "bob@example.com", account2);

        // Используем геттеры и сеттеры для Customer
        System.out.println("Имя первого клиента: " + customer1.getName());
        System.out.println("Email второго клиента: " + customer2.getEmail());

        customer1.setName("Alicia");
        customer2.setEmail("bob@newemail.com");

        // Выводим обновленные данные
        System.out.println("Обновленное имя первого клиента: " + customer1.getName());
        System.out.println("Обновленный email второго клиента: " + customer2.getEmail());

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

        // Выводим счета после изменений
        System.out.println("Обновленная информация о счетах:");
        System.out.println(account1);
        System.out.println(account2);
    }
}