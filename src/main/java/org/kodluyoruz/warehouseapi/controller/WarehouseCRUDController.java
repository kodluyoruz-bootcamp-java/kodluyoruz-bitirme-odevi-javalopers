package org.kodluyoruz.warehouseapi.controller;

import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponseHolder;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.kodluyoruz.warehouseapi.model.dto.WarehouseDTO;
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
        //warehouseCRUDService.list();
        model.addAttribute("listOfWarehouses",warehouseCRUDService.list().getResponseData());
        return "warehouses";
    }

    @PostMapping("/add")
    public String create(@ModelAttribute("warehouse") WarehouseDTO warehouseDTO) {
        warehouseCRUDService.create(warehouseDTO);
        return "redirect:/warehouses";
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

    @GetMapping("/create")
    public String showNewWarehouseForm(Model model){
        model.addAttribute("warehouse",new WarehouseDTO());
        return "create_warehouse";
    }

    @GetMapping("/edit/{id}")
    public String showFormForUpdate(@PathVariable Long id, Model model){
        model.addAttribute("warehouse", warehouseCRUDService.getById(id).getResponseData());
        return "update_warehouse";
    }
}