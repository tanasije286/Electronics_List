package ca.tanasije.electronics_list.entity;

import ca.tanasije.electronics_list.entity.enums.Location;
import ca.tanasije.electronics_list.entity.enums.OperatingSystem;
import ca.tanasije.electronics_list.entity.enums.PrimaryUse;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "Laptops")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Laptop {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long laptopId;

    @Column(name = "Label", nullable = false)
    @NotBlank(message = "Label cannot be blank")
    @Size(max = 10, message = "Label can have up to 10 characters")
    @NonNull
    private String laptopLabel;

    @Column(name = "Brand", nullable = false)
    @NotBlank(message = "Brand cannot be blank")
    @Size(max = 50, message = "Brand can have up to 50 characters")
    @NonNull
    private String laptopBrand;

    @Column(name = "Serial Number", nullable = false)
    @NotBlank(message = "Serial Number cannot be blank")
    @Size(max = 100, message = "Serial Number can have up to 100 characters")
    @NonNull
    private String laptopSerialNumber;

    @Column(name = "Owner", nullable = false)
    @NotBlank(message = "Laptop Owner cannot be blank")
    @Size(max = 50, message = "Laptop Owner can have up to 50 characters")
    @NonNull
    private String laptopOwner;

    @Column(name = "Location", nullable = false)
    @NotNull(message = "Location is required")
    @NonNull
    private Location laptopLocation;

    @Column(name = "Primary Use", nullable = false)
    @NotNull(message = "Primary use is required")
    @NonNull
    private PrimaryUse laptopPrimaryUse;

    @Column(name = "Operating System", nullable = false)
    @NotNull(message = "Operating system is required")
    @NonNull
    private OperatingSystem laptopOperatingSystem;

}
