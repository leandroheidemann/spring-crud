package br.com.leandroheidemann.springcrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class User {

    @Id
    private UUID id;

}
