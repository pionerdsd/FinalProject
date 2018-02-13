package entity;

import java.util.Objects;

public class Bill {
    private String login;
    private String type;
    private int quantity;
    private int price;

    public Bill() {

    }

    public Bill(String login, String type, int quantity, int price) {
        this.login = login;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "login='" + login + '\'' +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return quantity == bill.quantity &&
                price == bill.price &&
                Objects.equals(login, bill.login) &&
                Objects.equals(type, bill.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login, type, quantity, price);
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLogin() {
        return login;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
