package ca.tanasije.electronics_list.models;

import ca.tanasije.electronics_list.models.enums.Location;
import ca.tanasije.electronics_list.models.enums.OperatingSystem;
import ca.tanasije.electronics_list.models.enums.PrimaryUse;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long laptopId;
    private String laptopLabel;
    private String laptopBrand;
    private Long laptopSerialNumber;
    private String laptopOwner;
    private Location laptopLocation;
    private PrimaryUse laptopPrimaryUse;
    private OperatingSystem laptopOperatingSystem;

}
