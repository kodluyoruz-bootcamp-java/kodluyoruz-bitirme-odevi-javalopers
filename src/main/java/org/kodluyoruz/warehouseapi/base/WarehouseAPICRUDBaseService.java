<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.dto.BaseIDDTO;

import java.util.Collection;

public interface WarehouseAPICRUDBaseService<T extends BaseIDDTO> {

    WarehouseAPIResponseHolder<Collection<T>> list();

    WarehouseAPIResponseHolder<T> getById(Long id);

    WarehouseAPIResponseHolder<T> create(T data);

    WarehouseAPIResponseHolder<T> update(Long id, T data);

    WarehouseAPIResponseHolder<?> delete(Long id);
}
=======
package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.dto.BaseIDDTO;

import java.util.Collection;

public interface WarehouseAPICRUDBaseService<T extends BaseIDDTO> {

    WarehouseAPIResponseHolder<Collection<T>> list();

    WarehouseAPIResponseHolder<T> getById(Long id);

    WarehouseAPIResponseHolder<T> create(T data);

    WarehouseAPIResponseHolder<T> update(Long id, T data);

    WarehouseAPIResponseHolder<?> delete(Long id);
}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
