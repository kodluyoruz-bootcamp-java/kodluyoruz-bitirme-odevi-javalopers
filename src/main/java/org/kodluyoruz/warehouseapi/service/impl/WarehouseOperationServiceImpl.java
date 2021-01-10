package org.kodluyoruz.warehouseapi.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.kodluyoruz.warehouseapi.dao.WarehouseOperationRepository;
import org.kodluyoruz.warehouseapi.service.WarehouseOperationService;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
@Slf4j
public class WarehouseOperationServiceImpl implements WarehouseOperationService {

    private final WarehouseOperationRepository warehouseOperationRepository;

    @Override
    public boolean hasExistSameCode(String code) {
        return warehouseOperationRepository.hasExistSameCode(code);
    }

    @Override
    public boolean hasExistSameCodeAndId(Long id, String code) {
        return warehouseOperationRepository.hasExistSameCodeAndId(id, code);
    }

    @Override
    public boolean isThereAnyOfThis() {
        return warehouseOperationRepository.isThereAnyOfThis();
    }

    @Override
    public boolean isThereAnyProductForThisWarehouse(Long warehouseId) {
        return warehouseOperationRepository.isThereAnyProductForThisWarehouse(warehouseId);
    }
}
