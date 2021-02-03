<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.controller;

import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponseHolder;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.kodluyoruz.warehouseapi.model.dto.ProductWarehouseDTO;
import org.kodluyoruz.warehouseapi.model.entites.Summary;
import org.kodluyoruz.warehouseapi.service.StockOperationService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@SwaggerClient
@RequestMapping("/stocks")
public class StockController {

    private final StockOperationService stockOperationService;

    @PutMapping(path = "/{productId}/transfer/{fromWarehouseId}/{toWarehouseId}")
    public WarehouseAPIResponseHolder<?> transferThisProduct(@PathVariable("productId") Long productId,
                                                             @PathVariable("fromWarehouseId") Long fromWarehouseId,
                                                             @PathVariable("toWarehouseId") Long toWarehouseId) {
        return stockOperationService.transferThisProduct(productId, fromWarehouseId, toWarehouseId);
    }

    @PostMapping
    public WarehouseAPIResponseHolder<?> updateProductStockQuantity(@RequestBody ProductWarehouseDTO productWarehouseDTO) {
        return stockOperationService.updateProductStockQuantity(productWarehouseDTO);
    }

    @GetMapping
    public WarehouseAPIResponseHolder<Collection<Summary>> getSummaries() {
        return stockOperationService.getSummaries();
    }

    @PostMapping("/add")
    public WarehouseAPIResponseHolder<?> addNewStock(@RequestBody ProductWarehouseDTO productWarehouseDTO){
        return stockOperationService.addNewStock(productWarehouseDTO);
    }


}
=======
package org.kodluyoruz.warehouseapi.controller;

import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponseHolder;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.kodluyoruz.warehouseapi.model.dto.ProductWarehouseDTO;
import org.kodluyoruz.warehouseapi.model.entites.Summary;
import org.kodluyoruz.warehouseapi.service.StockOperationService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@SwaggerClient
@RequestMapping("/stocks")
public class StockController {

    private final StockOperationService stockOperationService;

    @PutMapping(path = "/{productId}/transfer/{fromWarehouseId}/{toWarehouseId}")
    public WarehouseAPIResponseHolder<?> transferThisProduct(@PathVariable("productId") Long productId,
                                                             @PathVariable("fromWarehouseId") Long fromWarehouseId,
                                                             @PathVariable("toWarehouseId") Long toWarehouseId) {
        return stockOperationService.transferThisProduct(productId, fromWarehouseId, toWarehouseId);
    }

    @PostMapping
    public WarehouseAPIResponseHolder<?> updateProductStockQuantity(@RequestBody ProductWarehouseDTO productWarehouseDTO) {
        return stockOperationService.updateProductStockQuantity(productWarehouseDTO);
    }

    @GetMapping
    public WarehouseAPIResponseHolder<Collection<Summary>> getSummaries() {
        return stockOperationService.getSummaries();
    }

    @PostMapping("/add")
    public WarehouseAPIResponseHolder<?> addNewStock(@RequestBody ProductWarehouseDTO productWarehouseDTO){
        return stockOperationService.addNewStock(productWarehouseDTO);
    }


}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
