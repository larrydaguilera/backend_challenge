package hahn.software.challenge.backend.models.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ProductDto {

    @NotNull(message = "The id can't be null")
    @NotEmpty(message = "The id can't be empty")
    @NotBlank (message = "The id can't be Blank")
    private Long id;

    @NotNull(message = "The name can't be null")
    @NotEmpty(message = "The name can't be empty")
    @NotBlank (message = "The name can't be Blank")
    private String name;

    @NotNull(message = "The description can't be null")
    @NotEmpty(message = "The description can't be empty")
    @NotBlank(message = "The description can't be Blank")
    private String description;

    @NotNull(message = "The price can't be null")
    @NotEmpty(message = "The price can't be empty")
    @NotBlank(message = "The price can't be Blank")
    private Integer price;
}
