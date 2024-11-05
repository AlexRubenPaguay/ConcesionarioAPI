package com.concesionario.domain;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehiculo")
public class Vehiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @NotEmpty
    @NotBlank
    @Column(unique = true)
    @Size(max = 10)
    private String placa;
    @NotNull
    @NotEmpty
    @NotBlank
    @Column(unique = true)
    @Size(max = 10)
    private String chasis;
    //@Column(name = "id_modelo")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(insertable = true, updatable = true, nullable = false)
    private Modelo modelo;
    //@ManyToMany(mappedBy = "vehiculos", fetch = FetchType.EAGER)
    //private List<Cliente> clientes;
}
