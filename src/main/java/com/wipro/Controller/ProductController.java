package com.wipro.Controller;


import com.wipro.Model.Product;
import com.wipro.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Get all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Search products by name
    @GetMapping("/search")
    public List<Product> searchByName(@RequestParam String name) {
        return productService.searchByName(name);
    }

    // Get products with price greater than given value
    @GetMapping("/above-price")
    public List<Product> getProductsAbovePrice(@RequestParam double price) {
        return productService.getProductsAbovePrice(price);
    }

    // Add a new product
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    // Delete a product by ID
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "Product deleted successfully";
    }
}
