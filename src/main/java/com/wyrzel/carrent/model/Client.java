package com.wyrzel.carrent.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
    private Long id;
    @Column(name = "client_username", nullable = false, unique = true, length = 32)
    private String username;
    @Column(name = "client_first_name", nullable = false, length = 32)
    private String firstName;
    @Column(name = "client_last_name", nullable = false, length = 32)
    private String lastName;
    @Column(name = "client_email", nullable = false)
    private String email;
    @Column(name = "client_password", nullable = false)
    private String password;
    @Transient
    private String rawPassword;

}
