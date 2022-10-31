package com.batuhan.dto.response;

import com.batuhan.repository.enums.Category;
import com.batuhan.repository.enums.Quality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Enumerated;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CreateStockDto {

    Long productid;
    String name;
    String brand;
    Category category;
    @Enumerated
    Quality quality;

}
