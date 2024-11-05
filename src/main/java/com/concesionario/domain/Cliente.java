package com.concesionario.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Entity
@Builder
@Validated
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 10)
    @Column(unique = true)
    private String identificacion;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 3, max = 50)
    private String nombres;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 3, max = 50)
    private String apellidos;
    @Column(name = "nombre_corto")
    @Size(min = 3, max = 100)
    private String nombreCorto;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 10, max = 50)
    private String direccion;
    @Email
    @Column(unique = true)
    @Size(max = 50)
    private String correo;

    @Column(unique = true)
    @Size(max = 10)
    private String telefono;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "clientes_vehiculos", joinColumns = @JoinColumn(name = "cliente_id", referencedColumnName = "id", insertable = true, updatable = true, nullable = false)
            , inverseJoinColumns = @JoinColumn(name = "vehiculo_id", referencedColumnName = "id", insertable = true, updatable = true, nullable = false)
    )
    private List<Vehiculos> vehiculos;

}
