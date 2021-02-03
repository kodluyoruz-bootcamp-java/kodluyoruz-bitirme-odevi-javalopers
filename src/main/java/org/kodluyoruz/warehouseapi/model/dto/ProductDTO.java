<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.kodluyoruz.warehouseapi.model.enums.StatusEnum;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDTO extends BaseIDDTO {

    private String code;
    private String name;
    private BigDecimal vatRate;
    private BigDecimal vatAmount;
    private BigDecimal price;
    private BigDecimal vatIncludedPrice;
    private StatusEnum status;

}
=======
package org.kodluyoruz.warehouseapi.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.kodluyoruz.warehouseapi.model.enums.StatusEnum;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDTO extends BaseIDDTO {

    private String code;
    private String name;
    private BigDecimal vatRate;
    private BigDecimal vatAmount;
    private BigDecimal price;
    private BigDecimal vatIncludedPrice;
    private StatusEnum status;

}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
