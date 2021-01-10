package org.kodluyoruz.warehouseapi.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponseError;
import org.kodluyoruz.warehouseapi.base.WarehouseAPIResponseHolder;
import org.kodluyoruz.warehouseapi.dao.WarehouseOperationRepository;
import org.kodluyoruz.warehouseapi.service.WarehouseOperationService;
import org.springframework.http.HttpStatus;
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

    @Override
    public boolean isThereAnyActiveWarehouseAtThisId(Long id) {
        return warehouseOperationRepository.isThereAnyActiveWarehouseAtThisId(id);
    }

    @Override
    public WarehouseAPIResponseHolder<?> transferAllProducts(Long fromWarehouseId, Long toWarehouseId) {
        boolean isFromWarehouseExist = isThereAnyActiveWarehouseAtThisId(fromWarehouseId);
        boolean isToWarehouseExist = isThereAnyActiveWarehouseAtThisId(toWarehouseId);

        if(!isFromWarehouseExist || !isToWarehouseExist){
            return new WarehouseAPIResponseHolder<>(HttpStatus.NO_CONTENT, WarehouseAPIResponseError
                    .builder()
                    .code("WRONG_WAREHOUSE_ID")
                    .message("An active repository for these ids was not found or selected warehouses are not active. Please check the values.")
                    .build());
        }

        warehouseOperationRepository.transferAllProducts(fromWarehouseId,toWarehouseId);

        return new WarehouseAPIResponseHolder<>(HttpStatus.OK);
    }
}
