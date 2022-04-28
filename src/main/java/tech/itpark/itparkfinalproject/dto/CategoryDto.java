package tech.itpark.itparkfinalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

    private String id;

    @NotNull
    private String categoryName;

    @NotNull
    private BigInteger amount;

    private String picture;

    @NotNull
    private String description;

    private Set<ProductDto> productTable;

}
