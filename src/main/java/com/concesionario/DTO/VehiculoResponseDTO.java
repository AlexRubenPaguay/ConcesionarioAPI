package com.concesionario.DTO;

import com.concesionario.domain.Modelo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoResponseDTO {
    private String placa;
    private Modelo modelo;
    private String chasis;
}
