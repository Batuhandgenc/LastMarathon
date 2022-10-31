package com.batuhan.dto.request;

import com.batuhan.repository.enums.Category;
import com.batuhan.repository.enums.Quality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CreateForWareHouseDto {

    @Id
    Long productid;
    String name;
    String brand;
    Category category;
    @Enumerated(EnumType.STRING)
    Quality quality;

}
