package com.concesionario.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@Validated
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Size(max = 10)
    @Column(unique = true, nullable = false)
    private String identificacion;
    @Size(min = 3, max = 50)
    @Column(nullable = false)
    private String nombres;
    @Size(min = 3, max = 50)
    @Column(nullable = false)
    private String apellidos;
    @Column(name = "nombre_corto", nullable = true)
    @Size(min = 3, max = 100)
    private String nombreCorto;
    @Size(min = 10, max = 50)
    @Column(nullable = false)
    private String direccion;
    @Email
    @Column(unique = true, nullable = false)
    @Size(max = 50)
    private String correo;
    @Size(max = 10)
    @Column(unique = true, nullable = false)
    private String telefono;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "clientes_vehiculos", joinColumns = @JoinColumn(name = "cliente_id", referencedColumnName = "id", insertable = true, updatable = true, nullable = false)
            , inverseJoinColumns = @JoinColumn(name = "vehiculo_id", referencedColumnName = "id", insertable = true, updatable = true, nullable = false)
    )
    private List<Vehiculos> vehiculos = new ArrayList<>();
}
