package hahn.software.challenge.backend.service.serviceImpl;

import hahn.software.challenge.backend.models.dto.ProductDto;
import hahn.software.challenge.backend.models.entity.ProductEntity;
import hahn.software.challenge.backend.models.mapper.ProductMapper;
import hahn.software.challenge.backend.repository.ProductRepository;
import hahn.software.challenge.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

   @Autowired
    private ProductRepository productRepository;
   @Autowired
   private ProductMapper productMapper;
    @Override
    public List<ProductDto> getAll() {
        List<ProductEntity> entities = productRepository.findAll();
        return productMapper.entityListToDto(entities) ;
    }

    @Override
    public ProductDto getById(Long id) {
        ProductEntity entity = productRepository.findById(id).get();
        return productMapper.entityToDto(entity);
    }

    @Override
    public ProductDto updateById(Long id, ProductDto dto) {
        ProductEntity entity = productRepository.findById(id).get();
        productMapper.updateEntity(dto,entity);
        productRepository.save(entity);
        return productMapper.entityToDto(entity);
    }

    @Override
    public ProductDto create(ProductDto dto) {
        ProductEntity entity = productMapper.createProduct(dto);
        productRepository.save(entity);
        return productMapper.entityToDto(entity);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);

    }
}
