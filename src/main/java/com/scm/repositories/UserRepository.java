package com.scm.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scm.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    // extra method db related operation
    // custom query method
    // custom finder method

    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);

}
