package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponseHolder;
import org.kodluyoruz.warehouseapi.base.WarehouseAndProductOperationBaseRepository;
import org.kodluyoruz.warehouseapi.base.WarehouseAndStockOperationBaseRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductWarehouseEntity;
import org.kodluyoruz.warehouseapi.model.entites.Summary;
import org.kodluyoruz.warehouseapi.model.entites.WarehouseEntity;

import java.util.Collection;


public interface WarehouseOperationRepository extends WarehouseAndProductOperationBaseRepository<WarehouseEntity>, WarehouseAndStockOperationBaseRepository {

    boolean isThereAnyProductForThisWarehouse(Long warehouseId);

    Collection<ProductWarehouseEntity> getStocksFromThisWarehouse(Long warehouseId);

    void deleteEntryWithTheseIds(Long productId, Long warehouseId);

    Collection<Summary> getProductsByWarehouseId(Long warehouseId);

}
