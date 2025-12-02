package com.example.productmanagement.service;

import com.example.productmanagement.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    
    List<Product> getAllProducts();
    
    Page<Product> getAllProducts(Pageable pageable);
    
    Optional<Product> getProductById(Long id);
    
    Product saveProduct(Product product);
    
    void deleteProduct(Long id);
    
    Page<Product> searchProducts(String keyword, Pageable pageable);
    
    List<Product> getProductsByCategory(String category);
    
    Page<Product> getProductsByCategory(String category, Pageable pageable);
    
    List<Product> advancedSearch(String name, String category, BigDecimal minPrice, BigDecimal maxPrice);
    
    Page<Product> advancedSearch(String name, String category, BigDecimal minPrice, BigDecimal maxPrice, Pageable pageable);
    
    List<String> getAllCategories();
    
    // Dashboard statistics methods
    long getTotalProductCount();
    
    long countByCategory(String category);
    
    BigDecimal calculateTotalValue();
    
    BigDecimal calculateAveragePrice();
    
    List<Product> findLowStockProducts(int threshold);
    
    List<Product> findRecentProducts(int limit);
}
