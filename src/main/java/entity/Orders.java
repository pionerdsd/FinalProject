package entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1360027122033386431L;


    private int id;
    //private Users user_id;
    private int user_id;
    //private Products product_id;
    private int product_id;
    private int quantity;
    private int price;
    private String date;
    //private Statuses status_id;
    private int status_id;
    private int payed;
    private int productcode;

    public Orders() {
    }

    public Orders(int user_id, int product_id, int quantity, int price, String date) {
        this.user_id = user_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.status_id = 1;
    }
/* public Orders(Users user_id, Products product_id, int quantity, int price, String date) {
        this.user_id = user_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
        this.date = date;

    }

    public Orders(int id, Users user_id, Products product_id, int quantity, int price, String date, Statuses status_id, int payed, int productcode) {
        this.id = id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.status_id = status_id;
        this.payed = payed;
        this.productcode = productcode;
    }*/

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", product_id=" + product_id +
                ", quantity=" + quantity +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", status_id=" + status_id +
                ", payed=" + payed +
                ", productcode=" + productcode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return id == orders.id &&
                user_id == orders.user_id &&
                product_id == orders.product_id &&
                quantity == orders.quantity &&
                price == orders.price &&
                status_id == orders.status_id &&
                payed == orders.payed &&
                productcode == orders.productcode &&
                Objects.equals(date, orders.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, user_id, product_id, quantity, price, date, status_id, payed, productcode);
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }
/*@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    public Products getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Products product_id) {
        this.product_id = product_id;
    }
    */

    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Column(name = "date", nullable = false, unique = true, length = 254)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   /* //@OneToOne (mappedBy = "id", cascade = CascadeType.ALL)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id")
    public Statuses getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Statuses status_id) {
        this.status_id = status_id;
    }*/

    @Column(name = "payed")
    public int getPayed() {
        return payed;
    }

    public void setPayed(int payed) {
        this.payed = payed;
    }

    @Column(name = "productcode")
    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }
}
