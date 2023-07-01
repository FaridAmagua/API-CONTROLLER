package com.daw.decotea.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Rols")
public class Rol {
    @Id
    private long rolId;
    private String rolName;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "rols")
    @JsonIgnore
    private Set<UserRol> userRols  =  new HashSet<>();
}


