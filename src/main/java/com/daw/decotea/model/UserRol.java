package com.daw.decotea.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "UsuarioRols")
public class UserRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long UserRolId;

    @JoinColumn(name = "fk_cliente_id", updatable = true)
    @ManyToOne(fetch = FetchType.EAGER)
    private User users;

	@JoinColumn(name = "fk_rol_id", updatable = true)
    @ManyToOne
    private Rol rols;

}
