package com.wyrzel.carrent.service.ClientService;

import com.wyrzel.carrent.model.Client;

import java.util.List;

public interface ClientService {

    void addClient(Client client);

    List<Client> getAllClients();

    Client getClient(Long id);

    void deleteClient(Long id);

    void updateClient(Long id, Client client);
}
