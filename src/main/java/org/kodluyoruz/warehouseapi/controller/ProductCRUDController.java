package org.kodluyoruz.warehouseapi.controller;


import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponseHolder;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.kodluyoruz.warehouseapi.model.dto.ProductDTO;
import org.kodluyoruz.warehouseapi.model.enums.StatusEnum;
import org.kodluyoruz.warehouseapi.service.ProductCRUDService;
import org.kodluyoruz.warehouseapi.service.ProductsOperationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequiredArgsConstructor
@SwaggerClient
@RequestMapping("/products")
public class ProductCRUDController {

    private final ProductCRUDService productCRUDService;
    private final ProductsOperationService productsOperationService;

    @GetMapping
    public String getAllProducts(Model model) {
        model.addAttribute("listOfProducts", productCRUDService.list().getResponseData());
        return "product/index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("statuses", StatusEnum.values());
        return "product/add_form";
    }

    @PostMapping
    public ResponseEntity<WarehouseAPIResponseHolder<ProductDTO>> create(@RequestBody ProductDTO productDTO) {
        return productCRUDService.create(productDTO);
    }

    @GetMapping("/update/{id}")
    public String showEditForm(@ModelAttribute("product") @PathVariable Long id, Model model) {
        model.addAttribute("product", productCRUDService.getById(id).getResponseData());
        model.addAttribute("statuses", StatusEnum.values());
        return "product/update_form";
    }

    @PutMapping("/{id}")
    public ResponseEntity<WarehouseAPIResponseHolder<ProductDTO>> update(@PathVariable Long id, @RequestBody ProductDTO productDTO) {
        return productCRUDService.update(id, productDTO);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WarehouseAPIResponseHolder<?>> delete(@PathVariable Long id) {
        return productCRUDService.delete(id);
    }

    @GetMapping("/warehouses/{id}")
    public String getAllProductsByProductsId(@PathVariable Long id, Model model) {
        model.addAttribute("listOfProductWarehouses", productsOperationService.getProductsAndWarehousesByProductId(id).getResponseData());
        return "product/product_warehouses";
    }
}
