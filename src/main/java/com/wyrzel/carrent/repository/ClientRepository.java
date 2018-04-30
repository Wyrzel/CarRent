package com.wyrzel.carrent.repository;

import com.wyrzel.carrent.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Long> {

}
