package com.daw.decotea.repository;

import com.daw.decotea.model.OrderDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderdetailRepository extends CrudRepository<OrderDetail,Long> {
//    OrderDetail findByOrderDetail_id(long l);
}
