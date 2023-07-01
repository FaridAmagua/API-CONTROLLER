package com.daw.decotea.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Pedido")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
//    @NotNull
    private String estado;
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Calendar fecha_creacion;
    //RELACIONES
    //pedido
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "fk_cliente_id", updatable = false)
    private User user;

    //productos
    @OneToMany(mappedBy = "pedidos",fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Set<Product> productos= new HashSet<>();
    //detalle pedido
    @OneToOne(mappedBy = "pedido",cascade =CascadeType.ALL,fetch = FetchType.EAGER)
    private OrderDetail detalle_pedido;
}
