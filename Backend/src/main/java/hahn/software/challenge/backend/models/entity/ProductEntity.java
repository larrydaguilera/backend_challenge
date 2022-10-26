package hahn.software.challenge.backend.models.entity;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Data
@Table(name= "products")
@SQLDelete(sql = "UPDATE products SET deleted = true Where id=?")
@Where(clause = "deleted=false")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "The name can't be null")
    @NotEmpty(message = "The name can't be blank")
    @NotEmpty
    @Column(nullable = false)
    private String name;

    @NotNull
    @NotEmpty
    @NotBlank
    @Column(nullable = false)
    private String description;

    @NotNull
    @NotEmpty
    @NotBlank
    @Column(nullable = false)
    private Integer price;

    private Timestamp timestamp;

    private Boolean deleted = Boolean.FALSE;


}
