package hahn.software.challenge.backend.service;

import hahn.software.challenge.backend.models.dto.ProductDto;

import java.util.List;

public interface ProductService {
     List<ProductDto> getAll();
     ProductDto getById(Long id);

     ProductDto updateById(Long id, ProductDto dto);

     ProductDto create(ProductDto dto);

     void deleteById(Long id);
}
