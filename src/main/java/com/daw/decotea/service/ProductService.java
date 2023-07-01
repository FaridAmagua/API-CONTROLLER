package com.daw.decotea.service;

import com.daw.decotea.model.Product;
import com.daw.decotea.repository.ICategoryRepository;
import com.daw.decotea.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private IProductRepository iProductRepository;
    @Autowired
    private ICategoryRepository iCategory;


    public Product saveProcuct(Product product ) throws Exception {
        Product localProduct=iProductRepository.findByProductname(product.getProductname());
        if (localProduct!=null){
            System.out.println("El producto ya existe");
            throw new Exception("El producto ya esta presente");
        }else {
            localProduct=iProductRepository.save(product);
        }
        return product;
    }
    public  Product getProduct(String s){
        return iProductRepository.findByProductname(s);
    }
    public void eliminarProducto(Long pLong) {
        iProductRepository.deleteById(pLong);
    }



}
