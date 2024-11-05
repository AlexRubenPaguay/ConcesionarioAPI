package com.concesionario.DTO;

import com.concesionario.domain.Marca;
import com.concesionario.domain.Modelo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoDTO {
    private String placa;
    private Marca marca;
    private Modelo modelo;
    private String chasis;
}
