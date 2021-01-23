package org.kodluyoruz.warehouseapi.controller;

import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponseHolder;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.kodluyoruz.warehouseapi.model.dto.WarehouseDTO;
import org.kodluyoruz.warehouseapi.model.enums.StatusEnum;
import org.kodluyoruz.warehouseapi.service.WarehouseCRUDService;
import org.kodluyoruz.warehouseapi.service.WarehouseOperationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@SwaggerClient
@RequestMapping("/warehouses")
@Controller
public class WarehouseCRUDController {

    private final WarehouseCRUDService warehouseCRUDService;
    private final WarehouseOperationService warehouseOperationService;

    @GetMapping
    public String getAllWarehouses(Model model) {
        model.addAttribute("listOfWarehouses",warehouseCRUDService.list().getResponseData());
        return "warehouses";
    }

    @GetMapping("/create")
    public String showCreateForm(){
        return "add_form";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("warehouse") WarehouseDTO warehouseDTO) {
        warehouseCRUDService.create(warehouseDTO);
        return "redirect:/warehouses";
    }

    @GetMapping("/update/{id}")
    public String showEditForm(@ModelAttribute("warehouse") @PathVariable Long id, Model model) {
        model.addAttribute("warehouse", warehouseCRUDService.getById(id).getResponseData());
        model.addAttribute("statuses", StatusEnum.values());
        return "edit_form";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute("warehouse") @PathVariable Long id, WarehouseDTO warehouseDTO) {
        warehouseCRUDService.update(id, warehouseDTO);
        return "redirect:/warehouses";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        warehouseCRUDService.delete(id);
        return "redirect:/warehouses";
    }

    @PutMapping(path = "/transfer/{fromWarehouseId}/{toWarehouseId}")
    public WarehouseAPIResponseHolder<?>  transferAllProducts
            (@PathVariable("fromWarehouseId") Long fromWarehouseId, @PathVariable("toWarehouseId") Long toWarehouseId){
        return warehouseOperationService.transferAllProducts(fromWarehouseId,toWarehouseId);
    }

/*

    @GetMapping("/edit/{id}")
    public String showFormForUpdate(@PathVariable Long id, Model model){
        model.addAttribute("warehouse", warehouseCRUDService.getById(id).getResponseData());
        return "update_warehouse";
    }*/
}