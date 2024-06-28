package com.parasnagpal99.microservices.product_service.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductEntity {
    @Id
    private String id ;
    private String name ;
    private String description ;
    private BigDecimal price ;
}

