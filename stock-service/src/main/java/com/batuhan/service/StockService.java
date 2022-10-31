package com.batuhan.service;

import com.batuhan.dto.request.CreateForWareHouseDto;
import com.batuhan.dto.request.UpdateForWareHouseDto;
import com.batuhan.exception.ErrorType;
import com.batuhan.exception.StockServiceException;
import com.batuhan.mapper.IStockMapper;
import com.batuhan.repository.IStockRepository;
import com.batuhan.repository.entity.Stock;
import com.batuhan.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService extends ServiceManager<Stock,Long> {

    private final IStockRepository stockRepository;

    public StockService(IStockRepository stockRepository) {
        super(stockRepository);
        this.stockRepository = stockRepository;
    }

    public Stock save(CreateForWareHouseDto dto){
        Stock stock = IStockMapper.INSTANCE.toStock(dto);
        return stockRepository.save(stock);
    }

    public Stock updateQuantity(UpdateForWareHouseDto dto){
        Optional<Stock> stock = stockRepository.findOptionalByProductid(dto.getProductid());
        if (stock.isPresent()){
            Double total = dto.getQuantity() + stock.get().getQuantity();
            stock.get().setQuantity(total);
        }
        return stockRepository.save(stock.get());
    }

    public Stock findStock(Long id){
        try {
            Optional<Stock> stock1 = stockRepository.findOptionalByProductid(id);
            return stock1.get();
        }catch (Exception e){
            throw new StockServiceException(ErrorType.URUN_BULUNAMADI);
        }
    }
    public List<Stock> findByName(String value){
        try {
            Optional<List<Stock>> stockList = stockRepository.findAllOptionalByNameContainingIgnoreCase(value);
            return stockList.get();
        }catch (Exception e){
            throw new StockServiceException(ErrorType.URUN_BULUNAMADI);
        }
    }
    public List<Stock> findAll(){
        return stockRepository.findAll();
    }
}
