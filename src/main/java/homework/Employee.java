package homework;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    String surname;
    String address;
    int paycheck;
    String seniority;

    public Employee(int id, String name, String surname, String address, int paycheck, String seniority) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.paycheck = paycheck;
        this.seniority = seniority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public String getSeniority() {
        return seniority;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", paycheck=" + paycheck +
                ", seniority='" + seniority + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                paycheck == employee.paycheck &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname) &&
                Objects.equals(address, employee.address) &&
                Objects.equals(seniority, employee.seniority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, address, paycheck, seniority);
    }
}
