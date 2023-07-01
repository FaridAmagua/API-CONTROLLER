package com.daw.decotea.controller;

import com.daw.decotea.model.Order;
import com.daw.decotea.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/")
    public Order saveProduct(@RequestBody Order order) throws Exception{
        return orderService.saveOrder(order);
    }

    @GetMapping("/{orderId}")
    public Order getOderById(@PathVariable("orderId") Long orderId){
        return orderService.getOrderById(orderId);
    }
    @DeleteMapping("/{orderId}")
    public void DeleteUserById(@PathVariable("orderId") Long orderId){
        orderService.deleteOrder(orderId);
    }


}
