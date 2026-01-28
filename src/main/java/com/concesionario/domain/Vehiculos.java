package com.concesionario.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehiculo")
public class Vehiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Size(max = 10)
    @Column(unique = true, nullable = false)
    private String placa;
    @Size(max = 10)
    @Column(unique = true, nullable = false)
    private String chasis;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(insertable = true, updatable = true, nullable = false)
    private Modelo modelo;
}
