package hahn.software.challenge.backend.models.mapper;

import hahn.software.challenge.backend.models.dto.ProductDto;
import hahn.software.challenge.backend.models.entity.ProductEntity;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMapper {

    public ProductEntity createProduct(ProductDto dto){
        ProductEntity entity = new ProductEntity();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setTimestamp(new Timestamp(System.currentTimeMillis()));
        entity.setDeleted(Boolean.FALSE);
        return entity;
    }

    public ProductDto entityToDto(ProductEntity entity){
        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setPrice(entity.getPrice());
        return dto;
    }

    public List<ProductDto> entityListToDto(List<ProductEntity> entities){
        List<ProductDto> dtos = new ArrayList<>();
        for(ProductEntity entity : entities){
            dtos.add(entityToDto(entity));
        }
        return dtos;
    }

    public ProductEntity dtoToEntity(ProductDto dto){
        ProductEntity entity = new ProductEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        return entity;
    }

    public ProductEntity updateEntity(ProductDto dto, ProductEntity entity){
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        return entity;
    }
}

