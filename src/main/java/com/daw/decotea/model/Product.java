package com.daw.decotea.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Products")
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;
    @Column(name = "productname")
    private String productname;
    private String description;
//	@Column(precision = 9, scale = 2)
    private int price;
    private int cantidadTotalDisponible; //tiene que ser menor que la cantidad total de cantidad_producto_comprada

    //productos optional true Para poder ingresar los productos sin problema ,pero tendria que ser not false
    @ManyToOne(optional = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_pedido_id",updatable = false)
    private Order pedidos;
    //categoria
    @OneToMany(mappedBy = "productos",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_pedido_id",updatable = false)
    private Set<Category> prodCategories= new HashSet<>();
}
