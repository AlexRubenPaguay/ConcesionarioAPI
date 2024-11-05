package com.concesionario.service;

import com.concesionario.DTO.ClienteDTO;
import com.concesionario.DTO.VehiculoDTO;
import com.concesionario.domain.Cliente;
import com.concesionario.domain.Vehiculos;
import com.concesionario.repository.IClienteDAO;
import com.concesionario.repository.IVehiculoDAO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteDAO clienteDAO;
    @Autowired
    private IVehiculoDAO vehiculoDAO;

    @Override
    public ClienteDTO save(ClienteDTO clienteDTO) {
        try {
            ModelMapper modelMapper = new ModelMapper();
            Cliente clienteEntity = modelMapper.map(clienteDTO, Cliente.class);
            this.clienteDAO.save(clienteEntity);
           /* for (Vehiculos ve:clienteDTO.getVehiculos()) {
             Vehiculos ve1=new Vehiculos();
             ve1.setPlaca(ve.getPlaca());
             ve.setModelo(ve.getModelo());
             ve.setChasis(ve.getChasis());
             vehiculoDAO.save(ve);


            }*/
            return clienteDTO;
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
            System.out.println("ERROR: " + ex.getStackTrace());
            throw new UnsupportedOperationException("Error : No se han podido guardar los datos del cliente...");
        }
    }

    @Override
    public ClienteDTO find(String identificacion) {
        Optional<Cliente> clienteEntity = this.clienteDAO.find(identificacion);
        if (clienteEntity.isPresent()) {
            ModelMapper modelMapper = new ModelMapper();
            Cliente currentCliente = clienteEntity.get();
            return modelMapper.map(currentCliente, ClienteDTO.class);
        }
        return new ClienteDTO();
    }
}