package org.kodluyoruz.warehouseapi.service;

import org.kodluyoruz.warehouseapi.base.WarehouseAndProductOperationBaseService;
import org.kodluyoruz.warehouseapi.model.dto.ProductDTO;

public interface ProductsOperationService extends WarehouseAndProductOperationBaseService<ProductDTO> {
    boolean isThereAnyProductForThisIdInStock(Long id);
}
