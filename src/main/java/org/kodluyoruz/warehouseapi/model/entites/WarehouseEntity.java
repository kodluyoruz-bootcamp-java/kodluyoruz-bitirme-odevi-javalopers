package org.kodluyoruz.warehouseapi.model.entites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.kodluyoruz.warehouseapi.model.enums.StatusEnum;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity(name = "warehouse")
@Getter
@Setter
@NoArgsConstructor
@Table(name = "WAREHOUSE")
public class WarehouseEntity extends BaseEntity {

    @OneToMany(mappedBy = "warehouseEntity",cascade = CascadeType.ALL)
    Set<ProductWarehouseEntity> productWarehouseEntitySet;

    @Column(name = "CODE", unique = true, length = 50, nullable = false)
    private String code;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "STATUS", length = 7, nullable = false)
    private StatusEnum status = StatusEnum.ACTIVE;

    @JsonBackReference
    @OneToMany(mappedBy = "warehouseEntity", cascade = CascadeType.ALL)
    private Collection<ProductWarehouseEntity> productWarehouseEntities;

}
