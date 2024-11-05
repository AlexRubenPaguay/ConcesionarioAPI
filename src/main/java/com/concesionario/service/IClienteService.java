package com.concesionario.service;

import com.concesionario.DTO.ClienteDTO;

public interface IClienteService {
    ClienteDTO save(ClienteDTO cliente);

    ClienteDTO find(String identificacion);

}
