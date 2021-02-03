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
