package com.batuhan.dto.response;

import com.batuhan.repository.enums.Quality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Enumerated;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UpdateStockDto {

    @Id
    Long productid;
    Double quantity;
    @Enumerated
    Quality quality;


}
