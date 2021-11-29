package homework;

import java.util.Objects;

public class Product {
    int netPrice;
    int grossPrice;
    boolean discount;
    double discountPercent;
    String name;
    String desctription;

    public Product(int netPrice, int grossPrice, boolean discount, double discountPercent, String name, String desctription) {
        this.netPrice = netPrice;
        this.grossPrice = grossPrice;
        this.discount = discount;
        this.discountPercent = discountPercent;
        this.name = name;
        this.desctription = desctription;
    }

    public int getNetPrice() {
        return netPrice;
    }

    public int getGrossPrice() {
        return grossPrice;
    }

    public boolean isDiscount() {
        return discount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public String getName() {
        return name;
    }

    public String getDesctription() {
        return desctription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "netPrice=" + netPrice +
                ", grossPrice=" + grossPrice +
                ", discount=" + discount +
                ", discountPercent=" + discountPercent +
                ", name='" + name + '\'' +
                ", desctription='" + desctription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return netPrice == product.netPrice &&
                grossPrice == product.grossPrice &&
                discount == product.discount &&
                Double.compare(product.discountPercent, discountPercent) == 0 &&
                Objects.equals(name, product.name) &&
                Objects.equals(desctription, product.desctription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(netPrice, grossPrice, discount, discountPercent, name, desctription);
    }
}
