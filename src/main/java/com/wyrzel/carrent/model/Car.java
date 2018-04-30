package com.wyrzel.carrent.model;


import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "car_id")
    private Long id;

    @Column(length = 32, nullable = false, name = "car_brand")
    private String brand;

    @Column(length = 32, nullable = false, name = "car_color")
    private String color;

    @Column(length = 32, nullable = false, unique = true, name = "car_license_plates")
    private String licensePlates;

    @Column(nullable = false,name = "car_price")
    private Integer price;

    @Column(name = "car_gearbox")
    @Enumerated(EnumType.STRING)
    private Gearbox gearbox;

    @Column(name = "car_status")
    @Enumerated(EnumType.STRING)
    private Status status;


    public enum Gearbox {
        AUTO,
        MANUAL
    }


    public enum Status {
        AVAILABLE,
        UNAVAILABLE
    }


}
