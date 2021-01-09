package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.base.WarehouseAPIOperationBaseRepository;
import org.kodluyoruz.warehouseapi.model.entites.WarehouseEntity;

/**
 * crud işlemlerini yaptığımız interface' e bu metotları dahil etmek istemedik çünkü orada sadece warehouse, products gibi
 * entity' lerin temel crud işlemler' i yapılıyor
 */

public interface WarehouseOperationRepository extends WarehouseAPIOperationBaseRepository<WarehouseEntity, String> {

    boolean isThereAnyProductForThisWarehouse(Long warehouseId);
}
