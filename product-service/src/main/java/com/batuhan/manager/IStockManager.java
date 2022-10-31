package com.batuhan.manager;

import com.batuhan.dto.response.CreateForWareHouseDto;
import com.batuhan.dto.response.UpdateStockDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.batuhan.constant.EndPoint.*;

@FeignClient(name = "stock-manager", url = "http://localhost:8090/api/v1/stock", decode404 = true)
public interface IStockManager {

    @PostMapping(SAVE)
    public ResponseEntity<Boolean> save(@RequestBody CreateForWareHouseDto dto);

    @PostMapping(UPDATESTOCK)
    public  ResponseEntity<Boolean> update(@RequestBody CreateForWareHouseDto dto);


}