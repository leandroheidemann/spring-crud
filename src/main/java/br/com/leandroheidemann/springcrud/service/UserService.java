package br.com.leandroheidemann.springcrud.service;

import br.com.leandroheidemann.springcrud.dao.UserDAO;
import br.com.leandroheidemann.springcrud.mapper.UserMapper;
import br.com.leandroheidemann.springcrud.models.UserDTO;
import br.com.leandroheidemann.springcrud.repository.UserRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDAO dao;
    private final UserRepository repository;
    private final UserMapper mapper;

    public UserService(UserDAO dao, UserRepository repository, UserMapper mapper) {
        this.dao = dao;
        this.repository = repository;
        this.mapper = mapper;
    }

    public UserDTO create(UserDTO dto) {
        final var entity = mapper.toEntity(dto);

        return mapper.toDTO(repository.save(entity));
    }

    public List<UserDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable)
                .map(mapper::toDTO)
                .toList();
    }

    public UserDTO findById(UUID id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow();
    }

    public UserDTO update(UUID id, UserDTO dto) {
        var entity = repository.findById(id)
                .orElseThrow();

        entity = mapper.toEntity(dto, entity);

        return mapper.toDTO(repository.save(entity));
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
