package com.parasnagpal99.microservices.product_service.Controller;


import com.parasnagpal99.microservices.product_service.dto.ProductRequest;
import com.parasnagpal99.microservices.product_service.dto.ProductResponse;
import com.parasnagpal99.microservices.product_service.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService ;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
            return  productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
           return productService.getAllProducts();
    }
}
