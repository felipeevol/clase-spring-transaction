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

    @Transactional(propagation = Propagation.NESTED)
    public void addCliente1() {
        Cliente cliente = new Cliente("Janine", "janine@example.com");
        entityManager.persist(cliente);
    }

    @Transactional(propagation = Propagation.NESTED)
    public void addCliente2() {
        Cliente cliente = new Cliente("Mirella", "mirella@example.com");
        entityManager.persist(cliente);
        int a = 9/0;
    }

}
