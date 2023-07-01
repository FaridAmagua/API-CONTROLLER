package com.daw.decotea.repository;

import com.daw.decotea.model.Product;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface IProductRepository extends CrudRepository<Product,Long> {

    Product findByProductname(String s);
}
