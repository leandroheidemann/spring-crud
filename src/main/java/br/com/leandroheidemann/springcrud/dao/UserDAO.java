package br.com.leandroheidemann.springcrud.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    @PersistenceContext
    private static EntityManager manager;

}
