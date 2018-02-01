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
@Table(name="statuses")
public class Statuses  implements Serializable{

    private static final long serialVersionUID = 1361127111156422231L;

    private int id;
    private int statustype;


    public Statuses() {}

    public Statuses(int id, int statustype) {
        this.id = id;
        this.statustype = statustype;
    }

    @Override
    public String toString() {
        return "Statuses{" +
                "id=" + id +
                ", statustype=" + statustype +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statuses statuses = (Statuses) o;
        return id == statuses.id &&
                statustype == statuses.statustype;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, statustype);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="statustype", nullable=false, unique=true, columnDefinition="INT DEFAULT 0")
    public int getStatustype() {
        return statustype;
    }

    public void setStatustype(int statustype) {
        this.statustype = statustype;
    }
}
