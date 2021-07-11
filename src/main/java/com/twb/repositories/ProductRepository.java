package com.twb.repositories;

import com.twb.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends MongoRepository<Product, String> {
}
