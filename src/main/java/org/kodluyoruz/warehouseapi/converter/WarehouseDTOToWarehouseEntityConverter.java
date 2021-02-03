<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.converter;

import org.kodluyoruz.warehouseapi.base.WarehouseAPIConverter;
import org.kodluyoruz.warehouseapi.model.dto.WarehouseDTO;
import org.kodluyoruz.warehouseapi.model.entites.WarehouseEntity;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Component
public class WarehouseDTOToWarehouseEntityConverter implements
        WarehouseAPIConverter<WarehouseDTO, WarehouseEntity> {
    @Override
    public WarehouseEntity convert(WarehouseDTO input) {
        WarehouseEntity warehouseEntity = new WarehouseEntity();
        warehouseEntity.setId(input.getId());
        warehouseEntity.setName(input.getName());
        warehouseEntity.setCode(input.getCode());
        warehouseEntity.setStatus(input.getStatus());
        warehouseEntity.setCreatedAt(Objects.isNull(input.getCreatedAt()) ? new Date() : input.getCreatedAt());
        warehouseEntity.setUpdatedAt(input.getUpdatedAt());
        return warehouseEntity;
    }
}
=======
package org.kodluyoruz.warehouseapi.converter;

import org.kodluyoruz.warehouseapi.base.WarehouseAPIConverter;
import org.kodluyoruz.warehouseapi.model.dto.WarehouseDTO;
import org.kodluyoruz.warehouseapi.model.entites.WarehouseEntity;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Component
public class WarehouseDTOToWarehouseEntityConverter implements
        WarehouseAPIConverter<WarehouseDTO, WarehouseEntity> {
    @Override
    public WarehouseEntity convert(WarehouseDTO input) {
        WarehouseEntity warehouseEntity = new WarehouseEntity();
        warehouseEntity.setId(input.getId());
        warehouseEntity.setName(input.getName());
        warehouseEntity.setCode(input.getCode());
        warehouseEntity.setStatus(input.getStatus());
        warehouseEntity.setCreatedAt(Objects.isNull(input.getCreatedAt()) ? new Date() : input.getCreatedAt());
        warehouseEntity.setUpdatedAt(input.getUpdatedAt());
        return warehouseEntity;
    }
}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
