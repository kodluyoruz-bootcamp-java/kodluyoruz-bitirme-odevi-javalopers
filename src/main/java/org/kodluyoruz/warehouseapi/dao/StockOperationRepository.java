<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.base.WarehouseAndStockOperationBaseRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductWarehouseEntity;
import org.kodluyoruz.warehouseapi.model.entites.Summary;

import java.util.Collection;
import java.util.Date;

public interface StockOperationRepository extends WarehouseAndStockOperationBaseRepository {
    Long getStockOfGivenProductFromThisWarehouse(Long productId, Long warehouseId);

    // ENTİTY GÖNDEREREK DOĞRUDAN UPDATE METODUYLA UPDATE İŞLEMİ YAPMAK İÇİN. ALTTAKİ METOD AYNI İŞİ YAPIYOR
    ProductWarehouseEntity updateProductStockQuantity(ProductWarehouseEntity productWarehouseEntity);

    void updateProductStockQuantity(Long productId, Long warehouseId, Long stockAmount, Date date, Long createdBy);

    Collection<Summary> getSummaries();
}
=======
package org.kodluyoruz.warehouseapi.dao;

import org.kodluyoruz.warehouseapi.base.WarehouseAndStockOperationBaseRepository;
import org.kodluyoruz.warehouseapi.model.entites.ProductWarehouseEntity;
import org.kodluyoruz.warehouseapi.model.entites.Summary;

import java.util.Collection;
import java.util.Date;

public interface StockOperationRepository extends WarehouseAndStockOperationBaseRepository {
    Long getStockOfGivenProductFromThisWarehouse(Long productId, Long warehouseId);

    // ENTİTY GÖNDEREREK DOĞRUDAN UPDATE METODUYLA UPDATE İŞLEMİ YAPMAK İÇİN. ALTTAKİ METOD AYNI İŞİ YAPIYOR
    ProductWarehouseEntity updateProductStockQuantity(ProductWarehouseEntity productWarehouseEntity);

    void updateProductStockQuantity(Long productId, Long warehouseId, Long stockAmount, Date date, Long createdBy);

    Collection<Summary> getSummaries();
}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
