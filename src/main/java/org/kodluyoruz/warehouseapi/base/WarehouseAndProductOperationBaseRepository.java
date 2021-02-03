<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.entites.BaseEntity;

public interface WarehouseAndProductOperationBaseRepository<T extends BaseEntity> {

    boolean hasExistSameCode(String code);

    boolean hasExistSameCodeAndId(Long id, String code);

    boolean isThereAnyOfThis();

    boolean isThereAnyActiveEntryAtThisId(Long id);
}
=======
package org.kodluyoruz.warehouseapi.base;

import org.kodluyoruz.warehouseapi.model.entites.BaseEntity;

public interface WarehouseAndProductOperationBaseRepository<T extends BaseEntity> {

    boolean hasExistSameCode(String code);

    boolean hasExistSameCodeAndId(Long id, String code);

    boolean isThereAnyOfThis();

    boolean isThereAnyActiveEntryAtThisId(Long id);
}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
