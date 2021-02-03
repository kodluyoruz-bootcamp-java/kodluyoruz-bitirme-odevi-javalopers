<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.entites.BaseEntity;

import java.util.Collection;

public interface WarehouseAPICRUDBaseRepository<T extends BaseEntity> {

    Collection<T> list();

    T getById(Long id);

    T create(T entity);

    T update(T entity);

    void delete(Long id);

}
=======
package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.entites.BaseEntity;

import java.util.Collection;

public interface WarehouseAPICRUDBaseRepository<T extends BaseEntity> {

    Collection<T> list();

    T getById(Long id);

    T create(T entity);

    T update(T entity);

    void delete(Long id);

}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
