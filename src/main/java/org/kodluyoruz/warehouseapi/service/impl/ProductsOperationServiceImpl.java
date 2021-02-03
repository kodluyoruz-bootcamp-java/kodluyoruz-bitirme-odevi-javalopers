package org.kodluyoruz.warehouseapi.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.kodluyoruz.warehouseapi.dao.ProductsOperationRepository;
import org.kodluyoruz.warehouseapi.service.ProductsOperationService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class ProductsOperationServiceImpl implements ProductsOperationService {

    private final ProductsOperationRepository productsOperationRepository;

    @Override
    public boolean hasExistSameCode(String code) {
        return productsOperationRepository.hasExistSameCode(code);
    }

    @Override
    public boolean hasExistSameCodeAndId(Long id, String code) {
        return productsOperationRepository.hasExistSameCodeAndId(id, code);
    }

    @Override
    public boolean isThereAnyOfThis() {
        return productsOperationRepository.isThereAnyOfThis();
    }

    @Override
    public boolean isThereAnyProductForThisIdInStock(Long productId) {
        return productsOperationRepository.isThereAnyProductForThisIdInStock(productId);
    }

    @Override
    public boolean isThereAnyActiveEntryAtThisId(Long id) {
        return productsOperationRepository.isThereAnyActiveEntryAtThisId(id);
    }
}
