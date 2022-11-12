package rent_car;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data

public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int price;
    @Column
    private String type;

    @Column
    private String name;
    @Column
    private String model;
    @Column
    private String engineType;
    @Column
    private String gearbox;


}
