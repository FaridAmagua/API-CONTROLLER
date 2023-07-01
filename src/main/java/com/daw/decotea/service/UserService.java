package com.daw.decotea.service;

import com.daw.decotea.model.User;
import com.daw.decotea.model.UserRol;
import com.daw.decotea.repository.IRolRepository;
import com.daw.decotea.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {
    @Autowired
    private IUserRepository usuarioRepository;

    @Autowired
    private IRolRepository rolRepository;


    public User guardarUsuario(User usuario, Set<UserRol> usuarioRoles) throws Exception {
        User usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        if(usuarioLocal !=null)
        {
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        }
        else{
            for(UserRol usuarioRol:usuarioRoles)
            { rolRepository.save(usuarioRol.getRols());
            }
            usuario.getUserRols().addAll(usuarioRoles);
            usuarioLocal =usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    public User obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }

}
