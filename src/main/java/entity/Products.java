package entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Products implements Serializable {

    private static final long serialVersionUID = 1360012347011186431L;


    private int id;
    private String type;
    private int price;
    private int quantity;
    private int ordered;
    private int productcode;

    public Products() {
    }

    public Products(int id) {
        this.id = id;
    }

    public Products(String type, int price) {
        this.type = type;
        this.price = price;

    }

    public Products(String type, int price, int quantity, int ordered, int productcode) {
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.ordered = ordered;
        this.productcode = productcode;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", ordered=" + ordered +
                ", productcode=" + productcode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return id == products.id &&
                price == products.price &&
                quantity == products.quantity &&
                ordered == products.ordered &&
                productcode == products.productcode &&
                Objects.equals(type, products.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, type, price, quantity, ordered, productcode);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "type", nullable = false, length = 254)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "price", nullable = false)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Column(name = "quantity", columnDefinition = "INT DEFAULT 0")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name = "ordered", columnDefinition = "INT DEFAULT 0")
    public int getOrdered() {
        return ordered;
    }

    public void setOrdered(int ordered) {
        this.ordered = ordered;
    }

    @Column(name = "productcode", columnDefinition = "INT DEFAULT 0")
    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }
}
