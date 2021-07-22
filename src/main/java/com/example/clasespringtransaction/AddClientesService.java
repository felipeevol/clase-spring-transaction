package com.example.clasespringtransaction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
public class AddClientesService {

    private final EntityManager entityManager;
    private final ClienteRepository clienteRepository;

    public AddClientesService(EntityManager entityManager, ClienteRepository clienteRepository) {
        this.entityManager = entityManager;
        this.clienteRepository = clienteRepository;
    }

    public String addCliente() {
        clienteRepository.addCliente1();
        clienteRepository.addCliente2();
        return "WORKED";
    }

}
