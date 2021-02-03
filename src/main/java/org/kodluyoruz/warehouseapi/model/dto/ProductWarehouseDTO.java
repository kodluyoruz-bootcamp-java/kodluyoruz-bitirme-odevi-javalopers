<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.kodluyoruz.warehouseapi.model.entites.embeddable.ProductWarehouseId;

import java.util.Date;

@Getter
@Setter
public class ProductWarehouseDTO {

    private ProductWarehouseId productWarehouseId;

    private Long stockAmount;

    private Date createdAt;

    private Long createdBy;
}
=======
package org.kodluyoruz.warehouseapi.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.kodluyoruz.warehouseapi.model.entites.embeddable.ProductWarehouseId;

import java.util.Date;

@Getter
@Setter
public class ProductWarehouseDTO {

    private ProductWarehouseId productWarehouseId;

    private Long stockAmount;

    private Date createdAt;

    private Long createdBy;
}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
