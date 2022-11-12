package rent_car;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="rent_detail")
public class RentDetail {

    @Id
    @GeneratedValue
    private double price;

    private String startDate;
    private String endDate;


}
