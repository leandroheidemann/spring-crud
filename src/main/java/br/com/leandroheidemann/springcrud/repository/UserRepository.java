package br.com.leandroheidemann.springcrud.repository;

import br.com.leandroheidemann.springcrud.entity.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
