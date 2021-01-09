package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.entites.BaseEntity;

public interface WarehouseAPIOperationBaseRepository<T extends BaseEntity, S extends String> {
    boolean hasExistSameCode(S code);

    boolean isThereAnyOfThis();
}
