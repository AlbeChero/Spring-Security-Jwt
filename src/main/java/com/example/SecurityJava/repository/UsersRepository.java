package com.example.SecurityJava.repository;

import com.example.SecurityJava.model.UsersDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<UsersDao, Integer> { //potrebbe causare errore a causa dell'interger, prova long nel caso
    Optional<UsersDao> findByUsername(String username);
}
