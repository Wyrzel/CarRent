package com.wyrzel.carrent.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "rents")
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Car car;

    @ManyToOne
    private Client client;

    @Column(nullable = false, name = "rent_start")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Timestamp rentStart;

    @Column(nullable = false, name= "rent_end")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Timestamp rentEnd;
}
