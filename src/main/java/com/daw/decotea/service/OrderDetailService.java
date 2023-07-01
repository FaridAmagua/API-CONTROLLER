package com.daw.decotea.service;

import com.daw.decotea.model.OrderDetail;
import com.daw.decotea.repository.IOrderdetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {
    @Autowired
    IOrderdetailRepository iOrderdetailRepository;

    public OrderDetail saveOrderDetail(OrderDetail orderDetail){
        return iOrderdetailRepository.save(orderDetail);
    }
    public void deleteOrderDetailById(Long aLong){
        iOrderdetailRepository.deleteById(aLong);
    }
}
