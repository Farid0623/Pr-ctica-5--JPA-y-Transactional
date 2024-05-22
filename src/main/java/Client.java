
import jakarta.persistence.*;
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;

    @Column(name = "watToPay")
    private String wayToPay;

    public Client(){

    }

    public Client(Long id, String name, String lastName, String wayToPay) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.wayToPay = wayToPay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWayToPay() {
        return wayToPay;
    }

    public void setWayToPay(String wayToPay) { this.wayToPay = wayToPay;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastName + '\'' +
                ", wayToPay='" + wayToPay + '\'' +
                '}';
    }
}
