package com.daw.decotea.controller;


import com.daw.decotea.model.Rol;
import com.daw.decotea.model.User;
import com.daw.decotea.model.UserRol;
import com.daw.decotea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    private UserService usuarioService;
    @PostMapping("/")
    public User guardarUsuario(@RequestBody User usuario) throws Exception{
        usuario.setProfile("default.png");
        Set<UserRol> usuarioRoles = new HashSet<>();

        Rol rol = new Rol();
        rol.setRolId(1L); ;
        rol.setRolName("NORMAL");

        UserRol usuarioRol = new UserRol();
        usuarioRol.setUsers(usuario);
        usuarioRol.setRols(rol);

        usuarioRoles.add(usuarioRol);
        return usuarioService.guardarUsuario(usuario,usuarioRoles);
    }

//    @GetMapping("/clientes")
//    public Iterable<User> listarClientes(){
//	return usuarioService.listarClientes();
//	}
    @GetMapping("/{username}")
    public User obtenerUsuario(@PathVariable("username") String username){
        return usuarioService.obtenerUsuario(username);
    }

    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioId){
        usuarioService.eliminarUsuario(usuarioId);
    }


}