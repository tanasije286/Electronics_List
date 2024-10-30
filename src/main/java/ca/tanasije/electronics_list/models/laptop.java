package ca.tanasije.electronics_list.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class laptop {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String laptopLabel;
    private String brand;
    private Long serialNumber;
    private String owner;
    private String location;
    private String primaryUse;
    private String operatingSystem;

}
