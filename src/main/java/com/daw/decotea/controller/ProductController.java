package com.daw.decotea.controller;

import com.daw.decotea.model.Product;
import com.daw.decotea.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/producto")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product) throws Exception{
        return productService.saveProcuct(product);
    }

    @GetMapping("/{productname}")
    public Product getProductName(@PathVariable("productname") String productname){
        return productService.getProduct(productname);
    }

    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioId){
        productService.eliminarProducto(usuarioId);
    }

}
