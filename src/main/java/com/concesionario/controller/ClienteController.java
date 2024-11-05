package com.concesionario.controller;

import com.concesionario.DTO.ClienteDTO;
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
    public ResponseEntity<ClienteDTO> save(@Valid @RequestBody ClienteDTO clienteDTO) {
        return new ResponseEntity<>(this.clienteService.save(clienteDTO), HttpStatus.CREATED);
    }

    @GetMapping("/find/{identificacion}")
    public ResponseEntity<ClienteDTO> find(@Valid @PathVariable String identificacion) {
        ClienteDTO clienteDTO = this.clienteService.find(identificacion);
        return new ResponseEntity<>(clienteDTO, HttpStatus.OK);
    }
}
