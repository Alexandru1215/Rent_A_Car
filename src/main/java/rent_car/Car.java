package rent_car;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Car {

    @Id
    @GeneratedValue
    private String type;

    private String name;
    private String model ;
    private String engineType;
    private String gearbox;




}
