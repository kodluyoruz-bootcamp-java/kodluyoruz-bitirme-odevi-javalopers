package org.kodluyoruz.warehouseapi.model.entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.kodluyoruz.warehouseapi.embeddable.ProductWarehouseId;
import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "PRODUCT_WAREHOUSE")
public class ProductWarehouse {

    @EmbeddedId
    private ProductWarehouseId productWarehouseId;

    @ManyToOne
    @MapsId("warehouseId")
    @JoinColumn(name = "warehouseId")
    WarehouseEntity warehouseEntity;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "productId")
    ProductEntity productEntity;

    @Column(name = "STOCK_AMOUNT", precision = 19, scale = 2, nullable = false)
    private Long stockAmount = Long.valueOf(0);

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TRANSACTION_DATE", nullable = false, updatable = false)
    private Date createdAt;

    @Column(name = "CREATED_BY", precision = 19, scale = 2, nullable = false)
    private Long createdBy;

}
