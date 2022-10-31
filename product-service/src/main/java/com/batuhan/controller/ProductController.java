package com.batuhan.controller;

import com.batuhan.dto.request.SaveRequestDto;
import com.batuhan.dto.request.UpdateRequestDto;
import com.batuhan.repository.entity.Product;
import com.batuhan.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.batuhan.constant.EndPoint.*;
import java.util.List;

@RestController
@RequestMapping(PRODUCT)
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping(SAVE)
    public ResponseEntity<String> save(@RequestBody SaveRequestDto dto){
        return ResponseEntity.ok(productService.save(dto));
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping(UPDATESTOCK)
    public ResponseEntity<String> update( UpdateRequestDto dto){
        return ResponseEntity.ok(productService.updateQuantity(dto));
    }

}
