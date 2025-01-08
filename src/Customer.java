import java.util.Objects;

public class Customer {
    private String name;       // Имя клиента
    private String email;      // Email клиента
    private Account account;   // Привязанный счет

    // Конструктор
    public Customer(String name, String email, Account account) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        this.name = name;
        this.email = email;
        this.account = account;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", account=" + account +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name) && email.equals(customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
