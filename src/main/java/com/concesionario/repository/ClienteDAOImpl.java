package com.concesionario.repository;

import com.concesionario.domain.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ClienteDAOImpl implements IClienteDAO {

    @Autowired
    private EntityManager em;

    @Override
    @Transactional
    public Optional<Cliente> find(String identificacion) {
        String clienteJPQL = "SELECT c " +
                "FROM Cliente c " +
                "JOIN FETCH c.vehiculos v " +
                "WHERE c.identificacion = :identificacion";
        TypedQuery<Cliente> clienteExistente = em.createQuery(clienteJPQL, Cliente.class);
        clienteExistente.setParameter("identificacion", identificacion);
        Cliente cliente = clienteExistente.getResultList().stream().findFirst().get();
        return Optional.of(cliente);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        this.em.persist(cliente);
        this.em.flush();
    }
}
