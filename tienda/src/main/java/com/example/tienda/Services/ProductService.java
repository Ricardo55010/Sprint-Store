package com.example.tienda.Services;

import com.example.tienda.DTO.ProductDTO;
import com.example.tienda.Models.Product;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productdto);
    ProductDTO getProduct(Long id);

    List<Product> getAllProducts();

    ProductDTO updateProduct(ProductDTO productDTO);

    void deleteProduct(Long id);

}
