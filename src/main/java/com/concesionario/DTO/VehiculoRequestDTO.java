package com.concesionario.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoRequestDTO {
    private String placa;
    private Long marca;
    private Long modelo;
    private String chasis;
}
