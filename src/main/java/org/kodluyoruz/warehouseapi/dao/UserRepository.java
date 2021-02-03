<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.model.entites.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String username);
}
=======
package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.model.entites.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String username);
}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
