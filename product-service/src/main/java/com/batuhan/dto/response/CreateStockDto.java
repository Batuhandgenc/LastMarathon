package com.batuhan.dto.response;

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
public class CreateStockDto {

    @Id
    Long productid;
    String name;
    String brandname;
    @Enumerated(EnumType.STRING)
    Category category;
    @Enumerated(EnumType.STRING)
    Quality quality;

}
