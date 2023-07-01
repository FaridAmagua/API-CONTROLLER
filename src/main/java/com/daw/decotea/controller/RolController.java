package com.daw.decotea.controller;

import com.daw.decotea.model.Rol;
import com.daw.decotea.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private RolService rolService;

    @PostMapping("/")
    public Rol saveProduct(@RequestBody Rol rol) throws Exception{
        return rolService.saveRol(rol);
    }

    @GetMapping("/{rolname}")
    public Rol getRolByName(@PathVariable("rolname") String rolname){
        return rolService.getRolByName(rolname);
    }

    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioId){
        rolService.deleteRolById(usuarioId);
    }
}
