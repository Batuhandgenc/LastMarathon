package com.batuhan.mapper;

import com.batuhan.dto.request.CreateForWareHouseDto;
import com.batuhan.dto.request.UpdateForWareHouseDto;
import com.batuhan.repository.entity.Stock;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IStockMapper {

    IStockMapper INSTANCE = Mappers.getMapper(IStockMapper.class);

    Stock toStock(final CreateForWareHouseDto dto);
    Stock toStock(final UpdateForWareHouseDto dto);
}
