package com.concesionario.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
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
    private Long id;
    @Column(unique = true, nullable = false)
    private String descripcion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(insertable = true, updatable = true, nullable = false)
    private Marca marca;
}
