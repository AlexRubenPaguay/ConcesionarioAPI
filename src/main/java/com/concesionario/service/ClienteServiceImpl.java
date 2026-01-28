package com.concesionario.service;

import com.concesionario.DTO.ClienteRequestDTO;
import com.concesionario.DTO.ClienteResponseDTO;
import com.concesionario.DTO.VehiculoRequestDTO;
import com.concesionario.domain.Cliente;
import com.concesionario.domain.Modelo;
import com.concesionario.domain.Vehiculos;
import com.concesionario.repository.IClienteDAO;
import com.concesionario.repository.IMarcaDAO;
import com.concesionario.repository.IModeloDAO;
import com.concesionario.repository.IVehiculoDAO;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteDAO clienteDAO;
    @Autowired
    private IVehiculoDAO vehiculoDAO;
    @Autowired
    private IMarcaDAO marcaDAO;
    @Autowired
    private IModeloDAO modeloDAO;

    private final ModelMapper _mapper = new ModelMapper();

    @Override
    public String save(ClienteRequestDTO clienteRequestDTO) {
        try {
            Cliente newCliente = new Cliente();
            newCliente.setId(clienteRequestDTO.getId());
            newCliente.setIdentificacion(clienteRequestDTO.getIdentificacion());
            newCliente.setNombres(clienteRequestDTO.getNombres());
            newCliente.setApellidos(clienteRequestDTO.getApellidos());
            newCliente.setDireccion(clienteRequestDTO.getDireccion());
            newCliente.setCorreo(clienteRequestDTO.getCorreo());
            newCliente.setTelefono(clienteRequestDTO.getTelefono());

            List<Vehiculos> listVehiculos = new ArrayList<>();

            for (VehiculoRequestDTO dto : clienteRequestDTO.getVehiculos()) {
                Optional<Modelo> modelo = modeloDAO.findById(dto.getModelo());
                //Optional<Marca> marca = marcaDAO.findById(dto.getMarca());
                Vehiculos vehiculo = new Vehiculos();
                vehiculo.setChasis(dto.getChasis());
                vehiculo.setPlaca(dto.getPlaca());
                vehiculo.setModelo(modelo.get());
                try {
                    vehiculoDAO.save(vehiculo);
                } catch (Exception e) {
                    log.error("Error: al guardar el vehículo -> " + e.getMessage());
                    throw new Exception("Error: al guardar el vehículo -> " + e.getMessage());
                }
                listVehiculos.add(vehiculo);
            }
            newCliente.setVehiculos(listVehiculos);
            try {
                clienteDAO.save(newCliente);
                return "Guardado exitoso...";
            } catch (Exception e) {
                log.error("Error: al guardar el cliente -> " + e.getMessage());
                throw new Exception("Error: al guardar el cliente -> " + e.getMessage());
            }
        } catch (Exception ex) {
            log.error("Error: inesperado al guardar -> " + ex.getMessage());
            throw new RuntimeException("Error  inesperado al guardar..." + ex.getMessage());
        }
    }

    @Override
    public ClienteResponseDTO find(String identificacion) {
        Optional<Cliente> clienteEntity = this.clienteDAO.find(identificacion);
        if (clienteEntity.isPresent()) {
            Cliente currentCliente = clienteEntity.get();
            return _mapper.map(currentCliente, ClienteResponseDTO.class);
        }
        return new ClienteResponseDTO();
    }
}