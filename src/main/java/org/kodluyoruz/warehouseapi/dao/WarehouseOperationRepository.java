package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.base.WarehouseAPIOperationBaseRepository;
import org.kodluyoruz.warehouseapi.model.entites.WarehouseEntity;


public interface WarehouseOperationRepository extends WarehouseAPIOperationBaseRepository<WarehouseEntity> {

    boolean isThereAnyProductForThisWarehouse(Long warehouseId);
}
