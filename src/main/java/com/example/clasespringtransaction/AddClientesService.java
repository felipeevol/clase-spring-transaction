package com.example.clasespringtransaction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
public class AddClientesService {

    private final EntityManager entityManager;

    public AddClientesService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public String addCliente() {
        Cliente cliente = new Cliente("Felipe", "felipecm@example.com");
        entityManager.persist(cliente);
        return "WORKED";
    }

}
