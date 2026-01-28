package com.concesionario.repository;

import com.concesionario.domain.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IModeloDAO extends JpaRepository<Modelo, Long> {
}
