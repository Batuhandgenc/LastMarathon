package com.batuhan.dto.request;

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
public class UpdateForWareHouseDto {

    @Id
    Long productid;
    Long quantity;
    @Enumerated(EnumType.STRING)
    String Quality;
}
