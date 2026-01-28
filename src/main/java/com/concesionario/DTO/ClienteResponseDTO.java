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
public class ClienteResponseDTO {
    private Long id;
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String nombreCorto;
    private String direccion;
    private String correo;
    private String telefono;
    private List<VehiculoResponseDTO> vehiculos;
}
