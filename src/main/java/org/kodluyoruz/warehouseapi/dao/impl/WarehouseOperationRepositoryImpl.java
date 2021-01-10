package org.kodluyoruz.warehouseapi.dao.impl;

import org.kodluyoruz.warehouseapi.base.AbstractBaseWarehouseAPIOperationRepository;
import org.kodluyoruz.warehouseapi.dao.WarehouseOperationRepository;
import org.kodluyoruz.warehouseapi.model.entites.WarehouseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class WarehouseOperationRepositoryImpl extends AbstractBaseWarehouseAPIOperationRepository<WarehouseEntity>
        implements WarehouseOperationRepository {

    // warehouse' un status' u deleted olarak işaretlendiği durumda o warehouse' a ilişkin stokta ürün var mı var mı diye kontrol
    @Override
    public boolean isThereAnyProductForThisWarehouse(Long warehouseId) {
        Long result = getSession()
                .createQuery("select count(*) from ProductWarehouse where warehouse_id=:warehouseId and stock_amount>0", Long.class)
                .setParameter("warehouseId", warehouseId)
                .uniqueResult();
        return result > 0;
    }

    @Override
    public boolean isThereAnyActiveWarehouseAtThisId(Long id) {
        Long result = getSession()
                .createQuery("select count(*) from WarehouseEntity where id=:warehouseId and status='ACTIVE'", Long.class)
                .setParameter("warehouseId", id)
                .uniqueResult();
        return result > 0;
    }

    @Override
    @Transactional
    public void transferAllProducts(Long fromWarehouseId, Long toWarehouseId) {
        getSession()
                .createQuery("update ProductWarehouse set warehouse_id=:toWarehouseId where warehouse_id=:fromWarehouseId")
                .setParameter("toWarehouseId", toWarehouseId)
                .setParameter("fromWarehouseId", fromWarehouseId)
                .executeUpdate();
    }
}
