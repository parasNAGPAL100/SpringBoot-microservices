package com.parasnagpal99.microservices.order_service.service;


import com.parasnagpal99.microservices.order_service.dto.OrderRequest;
import com.parasnagpal99.microservices.order_service.model.Order;
import com.parasnagpal99.microservices.order_service.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class OrderService {

       @Autowired
       private final OrderRepository orderRepository ;
       public void placeOrder(OrderRequest orderRequest){
           Order order = new Order() ;
           order.setOrderNumber(UUID.randomUUID().toString());
           order.setSkuCode(orderRequest.skuCode());
           order.setPrice(orderRequest.price());
           order.setQuantity(orderRequest.quantity());
           orderRepository.save(order);
       }
}
