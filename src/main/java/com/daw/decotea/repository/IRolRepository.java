package com.daw.decotea.repository;

import com.daw.decotea.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Long> {
    Rol findByRolName(String s);
}
