package com.concesionario.controller;

import com.concesionario.DTO.ClienteResponseDTO;
import com.concesionario.DTO.ClienteRequestDTO;
import com.concesionario.service.IClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/concesionario/cliente")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@Valid @RequestBody ClienteRequestDTO clienteRequestDTO) {
        return new ResponseEntity<>(this.clienteService.save(clienteRequestDTO), HttpStatus.CREATED);
    }

    @GetMapping("/find/{identificacion}")
    public ResponseEntity<ClienteResponseDTO> find(@Valid @PathVariable String identificacion) {
        ClienteResponseDTO clienteResponseDTO = this.clienteService.find(identificacion);
        return new ResponseEntity<>(clienteResponseDTO, HttpStatus.OK);
    }
}
