package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.dto.BaseIDDTO;

public interface WarehouseAPIOperationBaseService<T extends BaseIDDTO, S extends String> {

    boolean hasExistSameCode(S code);

    boolean isThereAnyOfThis();

}
