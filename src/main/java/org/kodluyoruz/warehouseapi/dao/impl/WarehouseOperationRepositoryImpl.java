package org.kodluyoruz.warehouseapi.dao.impl;

import org.kodluyoruz.warehouseapi.base.AbstractOperationBaseOperationRepository;
import org.kodluyoruz.warehouseapi.dao.WarehouseOperationRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductWarehouseEntity;
import org.kodluyoruz.warehouseapi.model.entites.WarehouseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Repository
@Transactional(readOnly = true)
public class WarehouseOperationRepositoryImpl extends AbstractOperationBaseOperationRepository<WarehouseEntity>
        implements WarehouseOperationRepository {

    // warehouse' un status' u deleted olarak işaretlendiği durumda o warehouse' a ilişkin stokta ürün var mı var mı diye kontrol
    @Override
    public boolean isThereAnyProductForThisWarehouse(Long warehouseId) {
        Long result = getSession()
                .createQuery("select count(*) from product_warehouse where warehouse_id=:warehouseId and stock_amount>0", Long.class)
                .setParameter("warehouseId", warehouseId)
                .uniqueResult();
        return result > 0;
    }

    // o warehouse id' ye ait stok bilgilerini getirir
    @Override
    public Collection<ProductWarehouseEntity> getStocksFromThisWarehouse(Long warehouseId) {
        return getSession()
                .createQuery("from " + ProductWarehouseEntity.class.getName() + "  where warehouse_id=:warehouseId", ProductWarehouseEntity.class)
                .setParameter("warehouseId", warehouseId)
                .getResultList();
    }

    // yeni bir kayıt olarak ProductWarehouse tablosune veri ekleme
    /*@Override
    @Transactional
    public void addThisStockAsNewRecord(ProductWarehouseEntity productWarehouseEntity) {
        getSession().persist(productWarehouseEntity);
    }*/
}
