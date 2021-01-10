package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.entites.BaseEntity;

public interface WarehouseAPIOperationBaseRepository<T extends BaseEntity> {

    boolean hasExistSameCode(String code);

    boolean hasExistSameCodeAndId(Long id, String code);

    boolean isThereAnyOfThis();
}
