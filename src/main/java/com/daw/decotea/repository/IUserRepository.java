package com.daw.decotea.repository;

import com.daw.decotea.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
