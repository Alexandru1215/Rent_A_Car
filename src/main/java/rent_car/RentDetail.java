package rent_car;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rent_detail")
public class RentDetail{



    @Id
    private int id;


    @Column
    private double price;
    @Column
    private String startDate;
    @Column
    private String endDate;


}
