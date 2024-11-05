package com.concesionario.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "marca")
public class Marca {
    @Id
    private Integer id;
    @Column(unique = true)
    private String descripcion;
}
