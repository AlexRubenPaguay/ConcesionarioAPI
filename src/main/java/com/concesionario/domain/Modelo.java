package com.concesionario.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NotNull
@NotEmpty
@NotBlank
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "modelo")
public class Modelo {
    @Id
    private Integer id;
    @Column(unique = true)
    private String descripcion;
    //@Column(name = "id_marca")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(insertable = true, updatable = true, nullable = false)
    private Marca marca;
}
