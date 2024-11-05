package com.concesionario.repository;

import com.concesionario.domain.Vehiculos;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VehiculoDAOImpl implements IVehiculoDAO {

    @Autowired
    private EntityManager em;

    @Override
    @Transactional
    public void save(Vehiculos vehiculos) {
        this.em.persist(vehiculos);
        this.em.flush();
    }
}
