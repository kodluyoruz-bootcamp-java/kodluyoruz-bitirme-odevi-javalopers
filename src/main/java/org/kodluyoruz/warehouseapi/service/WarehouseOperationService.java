package org.kodluyoruz.warehouseapi.service;

import org.kodluyoruz.warehouseapi.base.WarehouseAPIOperationBaseService;
import org.kodluyoruz.warehouseapi.model.dto.WarehouseDTO;

public interface WarehouseOperationService extends WarehouseAPIOperationBaseService<WarehouseDTO, String> {

    boolean isThereAnyProductForThisWarehouse(Long warehouseId);

}
