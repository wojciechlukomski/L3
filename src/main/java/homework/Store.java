package homework;

import java.util.Objects;

public class Store {
    String products;
    int employees;
    String name;
    String address;

    Employee employee; // to wersja poprawna
    Product product;
    Address address2;


    // czy tak mozemy zrobic? ->
    Employee employeeTest = new Employee(2, "bpp","bpp","bpp",23,"bpp");

    Product productTest = new Product(12,24,true,50.00,"franek","test");

    Address addressTest = new Address("test",2,"test");


    public Store(String products, int employees, String name, String address, Employee employeeTest, Product productTest, Address addressTest) {
        this.products = products;
        this.employees = employees;
        this.name = name;
        this.address = address;
        this.employeeTest = employeeTest;
        this.productTest = productTest;
        this.addressTest = addressTest;
    }



    public String getProducts() {
        return products;
    }

    public int getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Store{" +
                "products='" + products + '\'' +
                ", employees=" + employees +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", classEmployee=" + employeeTest +
                ", classProduct=" + productTest +
                ", classAddress2=" + addressTest +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return employees == store.employees &&
                Objects.equals(products, store.products) &&
                Objects.equals(name, store.name) &&
                Objects.equals(address, store.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, employees, name, address);
    }
}
