package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.entites.BaseEntity;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public abstract class AbstractBaseWarehouseAPIOperationRepository<T extends BaseEntity> extends AbstractBaseEntityManager<T>
        implements WarehouseAPIOperationBaseRepository<T> {

    // create işleminde kullanılır. veritabanında girilen koda sahip olan bir kayıt var mı diye kontrol eder
    @Override
    @Transactional
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
    @Transactional
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
    @Transactional
    public boolean isThereAnyOfThis() {
        Long result = getSession()
                .createQuery("select count(*) from " + entity.getName(), Long.class)
                .uniqueResult();
        return result > 0;
    }
}
