package com.wipro.Service;


import com.wipro.Model.Product;
import com.wipro.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Find product by name
    public List<Product> searchByName(String name) {
        return productRepository.findByName(name);
    }

    // Find products with price greater than a certain value
    public List<Product> getProductsAbovePrice(double price) {
        return productRepository.findProductsByPriceGreaterThan(price);
    }

    // Save a new product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Delete a product
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
