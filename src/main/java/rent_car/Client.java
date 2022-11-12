package rent_car;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue
    private Long licenseId;

    private String name;

    private Long phoneNumber;


    private String email;

    @OneToOne
    @JoinColumn(name = "type")
    private Car type;




}
