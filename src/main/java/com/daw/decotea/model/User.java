package com.daw.decotea.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
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
@Table(name = "Usuarios")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;
    @Nullable
    private String name;
    private String surname;
    private String username;
    private String email;
    private String password;
    private String address;
    private String number;
//    @Nullable
//    private boolean enable;
    private String profile;

    //roles tipo eager
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "users")
    @JsonIgnore
    private Set<UserRol>userRols = new HashSet<>();
    //pedidos
//	@OneToMany(mappedBy = "client",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    private Set<Pedido> pedidos= new HashSet<>();

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        Set<Authority> authorities = new HashSet<>();
//        this.userRols.forEach(userRol -> {
//            authorities.add(new Authority(userRol.getRol().getName()));
//        });
//        return authorities;
//    }

//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }

}
