package org.kodluyoruz.warehouseapi.controller;


import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponseHolder;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.kodluyoruz.warehouseapi.model.dto.ProductDTO;
import org.kodluyoruz.warehouseapi.service.ProductCRUDService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@SwaggerClient
@RequestMapping("/products")
public class ProductCRUDController {

    private final ProductCRUDService productCRUDService;

    @GetMapping
    public WarehouseAPIResponseHolder<Collection<ProductDTO>> getAllProducts() {
        return productCRUDService.list();
    }

    @PostMapping
    public WarehouseAPIResponseHolder<ProductDTO> create(@RequestBody ProductDTO productDTO) {
        //return productCRUDService.create(productDTO);
        return null;
    }

    @PutMapping("/{id}")
    public WarehouseAPIResponseHolder<ProductDTO> update(@PathVariable Long id, @RequestBody ProductDTO productDTO) {
       // return productCRUDService.update(id, productDTO);
        return null;
    }

    @DeleteMapping("/{id}")
    public WarehouseAPIResponseHolder<?> delete(@PathVariable Long id) {
        //return productCRUDService.delete(id);
        return null;
    }
}
