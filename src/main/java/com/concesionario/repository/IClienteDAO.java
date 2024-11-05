package com.concesionario.repository;

import com.concesionario.domain.Cliente;

import java.util.Optional;

public interface IClienteDAO {
    Optional<Cliente> find(String identificacion);

    void save(Cliente cliente);


}
