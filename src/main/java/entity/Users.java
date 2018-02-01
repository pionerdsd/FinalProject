package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1360027222056486431L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "login", nullable = false, unique = true, length = 254)
    private String login;
    @Column(name = "password", nullable = false, length = 254)
    private String password;
    @Column(name = "email", nullable = false, unique = true, length = 254)
    private String email;
    @Column(name = "telephone", nullable = false, unique = true, length = 254)
    private String telephone;
    @Column(name = "address", nullable = false, length = 254)
    private String address;
    @Column(name = "gender", nullable = false)
    private int gender;
    @Column(name = "birthday", nullable = false, length = 254)
    private String birthday;
    @Column(name = "knowledge", nullable = false, length = 254)
    private String knowledge;
    @Column(name = "role", columnDefinition = "INT DEFAULT 1")
    private int role;
    @Column(name = "del_status", columnDefinition = "INT DEFAULT 1")
    private int del_status;

    public Users() {

    }

    public Users(String login, String password, String email, String telephone, String address, int gender, String bithday, String knowledge) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.gender = gender;
        this.birthday = bithday;
        this.knowledge = knowledge;
        this.role = 2;
        this.del_status = 2;
    }

    public Users(String login, String password, String email, String telephone, String address, int gender, String bithday, String knowledge, int role, int del_status) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.gender = gender;
        this.birthday = bithday;
        this.knowledge = knowledge;
        this.role = role;
        this.del_status = del_status;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", bithday='" + birthday + '\'' +
                ", knowledge='" + knowledge + '\'' +
                ", role=" + role +
                ", del_status=" + del_status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id &&
                gender == users.gender &&
                role == users.role &&
                del_status == users.del_status &&
                Objects.equals(login, users.login) &&
                Objects.equals(password, users.password) &&
                Objects.equals(email, users.email) &&
                Objects.equals(telephone, users.telephone) &&
                Objects.equals(address, users.address) &&
                Objects.equals(birthday, users.birthday) &&
                Objects.equals(knowledge, users.knowledge);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, login, password, email, telephone, address, gender, birthday, knowledge, role, del_status);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }


    public String getBithday() {
        return birthday;
    }

    public void setBithday(String bithday) {
        this.birthday = bithday;
    }


    public String getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }


    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }


    public int getDel_status() {
        return del_status;
    }

    public void setDel_status(int del_status) {
        this.del_status = del_status;
    }
}
