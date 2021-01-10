package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.entites.BaseEntity;

public abstract class AbstractBaseWarehouseAPIOperationRepository<T extends BaseEntity> extends AbstractBaseEntityManager<T>
        implements WarehouseAPIOperationBaseRepository<T> {

    // create işleminde kullanılır. veritabanında girilen koda sahip olan bir kayıt var mı diye kontrol eder
    @Override
    public boolean hasExistSameCode(String code) {
        Long result = getSession()
                .createQuery("select count(*) from " + entity.getName() + " where code=:givenCode", Long.class)
                .setParameter("givenCode", code)
                .uniqueResult();
        return result > 0;
    }

    // update işleminde kullanılır. veritabanında girilen koda ve id' ye sahip olan bir kayıt var mı diye kontrol eder
    // update sırasında ürünün kodu aynı kalacak şekilde bir update yapıldığı senaryosu için kontrol
    @Override
    public boolean hasExistSameCodeAndId(Long id, String code) {
        Long result = getSession()
                .createQuery("select count(*) from " + entity.getName() + " where code=:givenCode and id<>:givenId", Long.class)
                .setParameter("givenCode", code)
                .setParameter("givenId", id)
                .uniqueResult();
        return result > 0;
    }

    // verilen entity ile ilgili veritabanında herhangi bir kayıt var mı kontrol eder
    @Override
    public boolean isThereAnyOfThis() {
        Long result = getSession()
                .createQuery("select count(*) from " + entity.getName(), Long.class)
                .uniqueResult();
        return result > 0;
    }
}
