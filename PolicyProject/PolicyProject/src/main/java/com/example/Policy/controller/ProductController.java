package com.example.Policy.controller;

import com.example.Policy.logic.ProductLogic;
import com.example.Policy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("")
public class ProductController {

    @Autowired
    ProductLogic productLogic;
    @PostMapping()
    public void createProduct(@RequestBody Product product)  {
        productLogic.createProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") String id) {
        return  productLogic.getProduct(id);

    }

}
