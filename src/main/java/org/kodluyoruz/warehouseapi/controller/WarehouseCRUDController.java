package org.kodluyoruz.warehouseapi.controller;

import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponseHolder;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.kodluyoruz.warehouseapi.model.dto.WarehouseDTO;
import org.kodluyoruz.warehouseapi.service.WarehouseCRUDService;
import org.kodluyoruz.warehouseapi.service.WarehouseOperationService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequiredArgsConstructor
@SwaggerClient
@RequestMapping("/warehouses")
public class WarehouseCRUDController {

    private final WarehouseCRUDService warehouseCRUDService;
    private final WarehouseOperationService warehouseOperationService;

    @GetMapping
    public WarehouseAPIResponseHolder<Collection<WarehouseDTO>> getAllWarehouses() {
        return warehouseCRUDService.list();
    }

    @PostMapping
    public WarehouseAPIResponseHolder<WarehouseDTO> create(@RequestBody WarehouseDTO warehouseDTO) {
        return warehouseCRUDService.create(warehouseDTO);
    }

    @PutMapping("/{id}")
    public WarehouseAPIResponseHolder<WarehouseDTO> update(@PathVariable Long id, @RequestBody WarehouseDTO warehouseDTO) {
        return warehouseCRUDService.update(id, warehouseDTO);
    }

    @DeleteMapping("/{id}")
    public WarehouseAPIResponseHolder<?> delete(@PathVariable Long id) {
        return warehouseCRUDService.delete(id);
    }

    @PutMapping(path = "/transfer/{fromWarehouseId}/{toWarehouseId}")
    public WarehouseAPIResponseHolder<?> transferAllProducts
            (@PathVariable("fromWarehouseId") Long fromWarehouseId, @PathVariable("toWarehouseId") Long toWarehouseId){
        return warehouseOperationService.transferAllProducts(fromWarehouseId,toWarehouseId);
    }
}

