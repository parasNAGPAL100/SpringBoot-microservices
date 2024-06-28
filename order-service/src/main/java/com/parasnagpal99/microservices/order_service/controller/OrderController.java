package com.parasnagpal99.microservices.order_service.controller;

import com.parasnagpal99.microservices.order_service.dto.OrderRequest;
import com.parasnagpal99.microservices.order_service.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
       private final OrderService orderService ;
       @PostMapping
       @ResponseStatus(HttpStatus.CREATED)
       public String placeOrder(@RequestBody OrderRequest orderRequest){
              orderService.placeOrder(orderRequest);
              return "Order Placed successfully" ;
       }
}
