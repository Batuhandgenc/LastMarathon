package com.batuhan.dto.request;

import com.batuhan.repository.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CreateForWareHouseDto {

    Long productid;
    String name;
    String brand;
    Category category;

}
