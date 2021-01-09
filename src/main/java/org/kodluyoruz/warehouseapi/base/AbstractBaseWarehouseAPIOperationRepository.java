package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.entites.BaseEntity;

public abstract class AbstractBaseWarehouseAPIOperationRepository<T extends BaseEntity, S extends String> extends AbstractBaseEntityManager<T>
        implements WarehouseAPIOperationBaseRepository<T,S> {

    @Override
    public boolean hasExistSameCode(S code) {
        Long result = getSession()
                .createQuery("select count(*) from " + entity.getName() + " where code=:givenCode", Long.class)
                .setParameter("givenCode", code)
                .uniqueResult();
        return result > 0;
    }

    @Override
    public boolean isThereAnyOfThis() {
        Long result = getSession()
                .createQuery("select count(*) from " + entity.getName() , Long.class)
                .uniqueResult();
        return result > 0;
    }
}
