package com.batuhan.mapper;

import com.batuhan.dto.request.SaveRequestDto;
import com.batuhan.dto.response.CreateForWareHouseDto;
import com.batuhan.dto.response.UpdateStockDto;
import com.batuhan.repository.entity.Product;
import com.batuhan.repository.enums.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-31T17:05:47+0300",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class IProductMapperImpl implements IProductMapper {

    @Override
    public Product toProduct(SaveRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        product.name( dto.getName() );
        product.brand( dto.getBrand() );
        if ( dto.getCathegory() != null ) {
            product.category( Enum.valueOf( Category.class, dto.getCathegory() ) );
        }

        return product.build();
    }

    @Override
    public CreateForWareHouseDto toCreateStockDto(Product product) {
        if ( product == null ) {
            return null;
        }

        CreateForWareHouseDto.CreateStockDtoBuilder createStockDto = CreateForWareHouseDto.builder();

        createStockDto.name( product.getName() );
        createStockDto.brand( product.getBrand() );
        createStockDto.category( product.getCategory() );

        return createStockDto.build();
    }

    @Override
    public UpdateStockDto toUpdateStockDto(Product product) {
        if ( product == null ) {
            return null;
        }

        UpdateStockDto.UpdateStockDtoBuilder updateStockDto = UpdateStockDto.builder();

        return updateStockDto.build();
    }
}
