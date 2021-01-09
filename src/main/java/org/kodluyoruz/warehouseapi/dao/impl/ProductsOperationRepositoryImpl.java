package org.kodluyoruz.warehouseapi.dao.impl;

import org.kodluyoruz.warehouseapi.base.AbstractBaseWarehouseAPIOperationRepository;
import org.kodluyoruz.warehouseapi.dao.ProductsOperationRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductEntity;
import org.springframework.stereotype.Repository;

@Repository
public class ProductsOperationRepositoryImpl extends AbstractBaseWarehouseAPIOperationRepository<ProductEntity, String >
        implements ProductsOperationRepository {

    @Override
    public boolean isThereAnyProductForThisId(Long productId) {
        Long result = getSession()
                .createQuery("select count(*) from ProductWarehouse where product_id=:productId and stock_amount>0", Long.class)
                .setParameter("productId", productId)
                .uniqueResult();
        return result > 0;
    }
}
