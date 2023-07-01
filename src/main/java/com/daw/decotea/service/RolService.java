package com.daw.decotea.service;

import com.daw.decotea.model.Rol;
import com.daw.decotea.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {
    @Autowired
    private IRolRepository irolRepository;
    public Rol saveRol(Rol rols)throws Exception{return irolRepository.save(rols);
    }

    public Rol getRolByName(String name){
        return irolRepository.findByRolName(name);
    }
    public void deleteRolById(Long rolLong) {
        irolRepository.deleteById(rolLong);
    }
}
