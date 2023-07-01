package com.daw.decotea.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "Categorias")

public class Category {
    @Id
    @SequenceGenerator(
            name = "category_sequence",
            sequenceName = "category_sequence",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "category_sequence" )
    private long id_categoria;
    @NotBlank
    private String nombre_categoria;
    private String descripcion;

    //producto
    @ManyToOne(optional = true,fetch = FetchType.EAGER) //cambiarlo a false fuera de prod una vez tenemos las categorias
    @JoinColumn(name = "fk_producto_id")
    private Product productos;
}
