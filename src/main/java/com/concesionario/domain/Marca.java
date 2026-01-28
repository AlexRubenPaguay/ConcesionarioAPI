package com.concesionario.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "marca")
public class Marca {
    @Id
    private Long id;
    @Column(unique = true, nullable = false)
    private String descripcion;
}
