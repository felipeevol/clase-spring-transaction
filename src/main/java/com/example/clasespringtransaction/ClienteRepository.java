package com.example.clasespringtransaction;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class ClienteRepository {

    private final EntityManager entityManager;

    public ClienteRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addCliente() {
        Cliente cliente = new Cliente("Pol", "pol@example.com");
        entityManager.persist(cliente);
    }

}
