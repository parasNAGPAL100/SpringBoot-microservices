package com.parasnagpal99.microservices.order_service.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id , String orderNumber , String skuCode , BigDecimal price , Integer quantity
                           ){
}