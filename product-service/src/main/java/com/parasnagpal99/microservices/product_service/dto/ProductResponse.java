package com.parasnagpal99.microservices.product_service.dto;

import java.math.BigDecimal;

public record ProductResponse(String id , String name , String description , BigDecimal price) {
}