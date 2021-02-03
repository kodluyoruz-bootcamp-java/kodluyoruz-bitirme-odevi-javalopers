<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.service;

import org.kodluyoruz.warehouseapi.model.dto.UserDTO;
import org.kodluyoruz.warehouseapi.model.entites.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserEntity save(UserDTO userDTO);
}
=======
package org.kodluyoruz.warehouseapi.service;

import org.kodluyoruz.warehouseapi.model.dto.UserDTO;
import org.kodluyoruz.warehouseapi.model.entites.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserEntity save(UserDTO userDTO);
}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
