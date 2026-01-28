package com.concesionario.service;

import com.concesionario.DTO.ClienteResponseDTO;
import com.concesionario.DTO.ClienteRequestDTO;

public interface IClienteService {
    String save(ClienteRequestDTO clienteRequestDTO);

    ClienteResponseDTO find(String identificacion);

}
