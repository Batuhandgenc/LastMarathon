package com.batuhan.mapper;

import com.batuhan.dto.request.SaveRequestDto;
import com.batuhan.dto.response.CreateStockDto;
import com.batuhan.dto.response.UpdateStockDto;
import com.batuhan.repository.entity.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-31T18:23:20+0300",
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

        return product.build();
    }

    @Override
    public CreateStockDto toCreateForWareHouseDto(Product product) {
        if ( product == null ) {
            return null;
        }

        CreateStockDto.CreateStockDtoBuilder createStockDto = CreateStockDto.builder();

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
