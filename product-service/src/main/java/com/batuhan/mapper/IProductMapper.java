package com.batuhan.mapper;

import com.batuhan.dto.request.SaveRequestDto;
import com.batuhan.dto.response.CreateForWareHouseDto;
import com.batuhan.dto.response.UpdateStockDto;
import com.batuhan.repository.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProductMapper {

    IProductMapper INSTANCE = Mappers.getMapper(IProductMapper.class);

    Product toProduct (final SaveRequestDto dto);

    CreateForWareHouseDto toCreateForWareHouseDto (final Product product);

    UpdateStockDto toUpdateStockDto (final Product product);

}
