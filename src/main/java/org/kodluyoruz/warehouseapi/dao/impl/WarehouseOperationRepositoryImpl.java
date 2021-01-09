package org.kodluyoruz.warehouseapi.dao.impl;

import org.kodluyoruz.warehouseapi.base.AbstractBaseWarehouseAPIOperationRepository;
import org.kodluyoruz.warehouseapi.dao.WarehouseOperationRepository;
import org.kodluyoruz.warehouseapi.model.entites.WarehouseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WarehouseOperationRepositoryImpl extends AbstractBaseWarehouseAPIOperationRepository<WarehouseEntity, String>
        implements WarehouseOperationRepository {

    @Override
    public boolean isThereAnyProductForThisWarehouse(Long warehouseId) {
        Long result = getSession()
                .createQuery("select count(*) from ProductWarehouse where warehouse_id=:warehouseId and stock_amount>0", Long.class)
                .setParameter("warehouseId", warehouseId)
                .uniqueResult();
        return result > 0;
    }
}
