package com.batuhan.service;

import com.batuhan.dto.request.SaveRequestDto;
import com.batuhan.dto.request.UpdateRequestDto;
import com.batuhan.dto.response.CreateStockDto;
import com.batuhan.dto.response.UpdateStockDto;
import com.batuhan.exception.ErrorType;
import com.batuhan.exception.ProductServiceException;
import com.batuhan.manager.IStockManager;
import com.batuhan.mapper.IProductMapper;
import com.batuhan.repository.IProductRepository;
import com.batuhan.repository.entity.Product;
import com.batuhan.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService extends ServiceManager<Product,Long> {

    private final IProductRepository productRepository;
    private final IStockManager stockManager;

    public ProductService(IProductRepository productRepository, IStockManager stockManager) {
        super(productRepository);
        this.productRepository = productRepository;
        this.stockManager = stockManager;
    }

    public String save(SaveRequestDto dto){

        Optional<Product> product = productRepository.findOptionalByNameAndBrandIgnoreCase(dto.getName(), dto.getBrand());
        if (product.isPresent()) throw new ProductServiceException(ErrorType.URUN_ZATEN_KAYITLI);

        try {
            product = Optional.ofNullable(IProductMapper.INSTANCE.toProduct(dto));
            save(product.get());
            stockManager.save(CreateStockDto.builder()
                    .category(product.get().getCategory())
                    .productid(product.get().getId())
                    .name(product.get().getName())
                    .brand(product.get().getBrand())
                    .build());
            return "Product is save";
        }catch (Exception e){
            throw new ProductServiceException(ErrorType.URUN_KAYDEDILEMEDI);
        }

    }

    public String updateQuantity(UpdateRequestDto dto){
        Optional<Product> product = productRepository.findOptionalById(dto.getId());
        if (product.isPresent()){

        }
        return "Market stock is updated";
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
