package org.kodluyoruz.warehouseapi.service;

import org.kodluyoruz.warehouseapi.base.WarehouseAPIOperationBaseService;
import org.kodluyoruz.warehouseapi.model.dto.BaseIDDTO;

public interface WarehouseOperationService extends WarehouseAPIOperationBaseService<BaseIDDTO> {

    boolean isThereAnyProductForThisWarehouse(Long warehouseId);

}
