package com.concesionario.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequestDTO {
    private Long id;
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String correo;
    private String telefono;
    private List<VehiculoRequestDTO> vehiculos;
}
