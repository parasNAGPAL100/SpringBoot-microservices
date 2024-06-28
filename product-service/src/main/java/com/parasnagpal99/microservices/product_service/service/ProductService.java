package com.parasnagpal99.microservices.product_service.service;


import com.parasnagpal99.microservices.product_service.Entity.ProductEntity;
import com.parasnagpal99.microservices.product_service.Repository.ProductRepository;
import com.parasnagpal99.microservices.product_service.dto.ProductRequest;
import com.parasnagpal99.microservices.product_service.dto.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProductService {
       private final ProductRepository productRepository ;

       public ProductResponse createProduct(ProductRequest productRequest){
           ProductEntity product = ProductEntity.builder()
                   .id(productRequest.id())
                   .price(productRequest.price())
                   .description(productRequest.description())
                   .name(productRequest.name())
                   .build();
           productRepository.save(product);
           log.info("Product created successfully for id : {}" , productRequest.id());
           return new ProductResponse(product.getId(),product.getName(),product.getDescription(),product.getPrice()) ;
       }

       public List<ProductResponse> getAllProducts(){
              return productRepository.findAll()
                      .stream()
                      .map(productEntity -> new ProductResponse(productEntity.getId(),productEntity.getName(),productEntity.getDescription(),productEntity.getPrice()))
                      .toList();
       }


}
