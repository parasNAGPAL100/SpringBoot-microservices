package com.parasnagpal99.microservices.product_service.Repository;

import com.parasnagpal99.microservices.product_service.Entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity,String> {

}
