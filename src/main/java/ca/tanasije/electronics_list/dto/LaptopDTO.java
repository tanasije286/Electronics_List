package ca.tanasije.electronics_list.dto;

import ca.tanasije.electronics_list.entity.enums.Location;
import ca.tanasije.electronics_list.entity.enums.OperatingSystem;
import ca.tanasije.electronics_list.entity.enums.PrimaryUse;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LaptopDTO {
    private Long laptopId;
    private String laptopLabel;
    private String laptopBrand;
    private String laptopSerialNumber;
    private String laptopOwner;
    private Location laptopLocation;
    private PrimaryUse laptopPrimaryUse;
    private OperatingSystem laptopOperatingSystem;
}
