package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.base.WarehouseAPIOperationBaseRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductEntity;

public interface ProductsOperationRepository extends WarehouseAPIOperationBaseRepository<ProductEntity> {
    boolean isThereAnyProductForThisId(Long id);
}
