package com.daw.decotea.service;

import com.daw.decotea.model.Order;
import com.daw.decotea.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private IOrderRepository iOrderRepository;

    public Order saveOrder(Order order)throws Exception{
        return iOrderRepository.save(order);
    }
    public Order getOrderById(Long id){
        return iOrderRepository.findByOrderId(id);
    }
    public void deleteOrder(Long id){
         iOrderRepository.deleteById(id);
    }

}
