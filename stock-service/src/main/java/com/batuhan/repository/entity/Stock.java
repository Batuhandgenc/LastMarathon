package com.batuhan.repository.entity;

import com.batuhan.repository.enums.Category;
import com.batuhan.repository.enums.Quality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long productid;
    String name;
    String brand;
    @Enumerated(EnumType.STRING)
    Category category;
    @Builder.Default
    Double quantity = Double.valueOf(0);
    @Enumerated(EnumType.STRING)
    Quality quality;


}
