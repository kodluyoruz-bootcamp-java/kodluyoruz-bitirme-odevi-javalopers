package org.kodluyoruz.warehouseapi.dao.impl;

import org.kodluyoruz.warehouseapi.base.AbstractOperationBaseOperationRepository;
import org.kodluyoruz.warehouseapi.dao.ProductsOperationRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductEntity;
import org.springframework.stereotype.Repository;

@Repository
public class ProductsOperationRepositoryImpl extends AbstractOperationBaseOperationRepository<ProductEntity>
        implements ProductsOperationRepository {

    // product' un status' u deleted olarak işaretlendiği durumda o product stokta var mı diye kontrol
    @Override
    public boolean isThereAnyProductForThisIdInStock(Long productId) {
        Long result = getSession()
                .createQuery("select count(*) from product_warehouse where product_id=:productId and stock_amount>0", Long.class)
                .setParameter("productId", productId)
                .uniqueResult();
        return result > 0;
    }
}
