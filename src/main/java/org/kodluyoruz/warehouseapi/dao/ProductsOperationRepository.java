<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.base.WarehouseAndProductOperationBaseRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductEntity;

public interface ProductsOperationRepository extends WarehouseAndProductOperationBaseRepository<ProductEntity> {
    boolean isThereAnyProductForThisIdInStock(Long id);
}
=======
package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.base.WarehouseAndProductOperationBaseRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductEntity;

public interface ProductsOperationRepository extends WarehouseAndProductOperationBaseRepository<ProductEntity> {
    boolean isThereAnyProductForThisIdInStock(Long id);
}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
