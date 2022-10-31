package com.batuhan.repository.entity;

import com.batuhan.repository.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String brand;
    @Enumerated(EnumType.STRING)
    Category category;
    Long productionDate;
    Long expiredDate;

}
