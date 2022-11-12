package rent_car;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;

    @Column
    private Long licenseId;
    @Column
    private String name;
    @Column
    private Long phoneNumber;

    @Column
    private String email;

}
