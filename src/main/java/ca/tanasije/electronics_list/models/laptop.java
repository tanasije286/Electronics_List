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
public class laptop {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String laptopLabel;
    private String brand;
    private Long serialNumber;
    private String owner;
    private Location location;
    private PrimaryUse primaryUse;
    private OperatingSystem operatingSystem;

}
