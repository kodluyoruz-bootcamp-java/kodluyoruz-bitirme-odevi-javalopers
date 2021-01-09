package org.kodluyoruz.warehouseapi.embeddable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class ProductWarehouseId implements Serializable {
    @Column(name = "warehouse_id")
    private Long warehouseId;
    @Column(name = "product_id")
    private Long productId;
}
