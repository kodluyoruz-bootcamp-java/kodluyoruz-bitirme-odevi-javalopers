package org.kodluyoruz.warehouseapi.service;

import org.kodluyoruz.warehouseapi.model.dto.UserDTO;
import org.kodluyoruz.warehouseapi.model.entites.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    //UserDetails loadUserByUsername(String username);
    UserEntity save(UserDTO userDTO);

}
