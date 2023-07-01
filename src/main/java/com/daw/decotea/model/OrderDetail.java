package com.daw.decotea.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "detallePedido")
public class OrderDetail {
    @Id
    @SequenceGenerator(name = "detalle_sequence", sequenceName = "detalle_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detalle_sequence")
    private long OrderDetail_id;
    @NotNull
    private int cantidad_producto_comprada;
    @NotNull
    private int precio_unitario;
    // DETALLE-PEDIDO
    @OneToOne
    @JoinColumn(name = "fk_pedido_id")
    private Order pedido;
}
