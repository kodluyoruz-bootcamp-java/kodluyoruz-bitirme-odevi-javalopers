<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.base.WarehouseAndProductOperationBaseRepository;
import org.kodluyoruz.warehouseapi.base.WarehouseAndStockOperationBaseRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductWarehouseEntity;
import org.kodluyoruz.warehouseapi.model.entites.WarehouseEntity;

import java.util.Collection;


public interface WarehouseOperationRepository extends WarehouseAndProductOperationBaseRepository<WarehouseEntity>, WarehouseAndStockOperationBaseRepository {

    boolean isThereAnyProductForThisWarehouse(Long warehouseId);

    Collection<ProductWarehouseEntity> getStocksFromThisWarehouse(Long warehouseId);

    void deleteEntryWithTheseIds(Long productId, Long warehouseId);

}
=======
package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.base.WarehouseAndProductOperationBaseRepository;
import org.kodluyoruz.warehouseapi.base.WarehouseAndStockOperationBaseRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductWarehouseEntity;
import org.kodluyoruz.warehouseapi.model.entites.WarehouseEntity;

import java.util.Collection;


public interface WarehouseOperationRepository extends WarehouseAndProductOperationBaseRepository<WarehouseEntity>, WarehouseAndStockOperationBaseRepository {

    boolean isThereAnyProductForThisWarehouse(Long warehouseId);

    Collection<ProductWarehouseEntity> getStocksFromThisWarehouse(Long warehouseId);

    void deleteEntryWithTheseIds(Long productId, Long warehouseId);

}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
