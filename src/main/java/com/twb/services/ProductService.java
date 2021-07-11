package com.twb.services;

import com.twb.commands.ProductForm;
import com.twb.domain.Product;

import java.util.List;


public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
