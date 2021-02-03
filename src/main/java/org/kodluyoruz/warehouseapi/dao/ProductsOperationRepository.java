package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.base.WarehouseAndProductOperationBaseRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductEntity;

public interface ProductsOperationRepository extends WarehouseAndProductOperationBaseRepository<ProductEntity> {
    boolean isThereAnyProductForThisIdInStock(Long id);
}
