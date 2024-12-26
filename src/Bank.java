import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;                // Название банка
    private List<Customer> customers;   // Список клиентов

    // Конструктор
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Метод для добавления клиента
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Метод для отображения всех клиентов
    public void displayCustomers() {
        System.out.println("Список клиентов банка " + name + ":");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}