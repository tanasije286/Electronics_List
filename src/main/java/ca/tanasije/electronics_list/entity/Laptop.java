package ca.tanasije.electronics_list.entity;

import ca.tanasije.electronics_list.entity.enums.Location;
import ca.tanasije.electronics_list.entity.enums.OperatingSystem;
import ca.tanasije.electronics_list.entity.enums.PrimaryUse;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Laptop {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long laptopId;

    @NotBlank(message = "Label cannot be blank")
    @Size(max = 10, message = "Label can have up to 10 characters")
    @NonNull
    private String laptopLabel;

    @NotBlank(message = "Brand cannot be blank")
    @Size(max = 50, message = "Brand can have up to 50 characters")
    @NonNull
    private String laptopBrand;

    @NotBlank(message = "Serial Number cannot be blank")
    @Size(max = 100, message = "Serial Number can have up to 100 characters")
    @NonNull
    private String laptopSerialNumber;

    @NotBlank(message = "Laptop Owner cannot be blank")
    @Size(max = 50, message = "Laptop Owner can have up to 50 characters")
    @NonNull
    private String laptopOwner;

    @NotNull(message = "Location is required")
    @NonNull
    private Location laptopLocation;

    @NotNull(message = "Primary use is required")
    @NonNull
    private PrimaryUse laptopPrimaryUse;

    @NotNull(message = "Operating system is required")
    @NonNull
    private OperatingSystem laptopOperatingSystem;

}
