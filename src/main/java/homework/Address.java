package homework;

import java.util.Objects;

public class Address {
    String street;
    int apartmentNumber;
    String city;

    public Address(String street, int apartmentNumber, String city) {
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", apartmentNumber=" + apartmentNumber +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return apartmentNumber == address.apartmentNumber &&
                Objects.equals(street, address.street) &&
                Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, apartmentNumber, city);
    }
}
