package com.studying.FirstSpringProject.services;

import com.studying.FirstSpringProject.entities.Product;
import com.studying.FirstSpringProject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Integer id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
