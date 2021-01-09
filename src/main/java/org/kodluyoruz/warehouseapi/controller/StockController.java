package org.kodluyoruz.warehouseapi.controller;

import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@SwaggerClient
@RequestMapping("/stocks")
public class StockController {
}
