package org.kodluyoruz.warehouseapi.service;

import org.kodluyoruz.warehouseapi.base.WarehouseAPIOperationBaseService;
import org.kodluyoruz.warehouseapi.model.dto.ProductDTO;

public interface ProductsOperationService extends WarehouseAPIOperationBaseService<ProductDTO,String> {
    boolean isThereAnyProductForThisId(Long id);
}
