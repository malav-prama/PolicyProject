package com.example.Policy.logic;
import com.example.Policy.dao.ProductDAO;
import com.example.Policy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class ProductLogic {

    @Autowired
    ProductDAO productDao;

    public void createProduct(Product product)  {
        productDao.saveProduct(product);
    }



    public Product getProduct(String id)
    {
        return productDao.getProduct(id);
    }

}
