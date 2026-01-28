package com.concesionario.repository;

import com.concesionario.domain.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMarcaDAO extends JpaRepository<Marca, Long> {
}
