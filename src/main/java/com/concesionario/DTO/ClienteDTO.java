package com.concesionario.DTO;

import com.concesionario.domain.Vehiculos;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private Integer id;
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String correo;
    private String telefono;
    private List<Vehiculos> vehiculos;
}
