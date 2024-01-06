package br.com.leandroheidemann.springcrud.mapper;

import br.com.leandroheidemann.springcrud.entity.User;
import br.com.leandroheidemann.springcrud.models.UserDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User toEntity(UserDTO dto);
    User toEntity(UserDTO dto, User entity);
    UserDTO toDTO(User entity);

}
