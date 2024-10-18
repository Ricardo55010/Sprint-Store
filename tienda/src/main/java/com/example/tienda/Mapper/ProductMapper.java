package com.example.tienda.Mapper;

import com.example.tienda.DTO.ProductDTO;
import com.example.tienda.Models.Product;

public class ProductMapper {
    public static Product mapToProduct(ProductDTO productdto){
        return new Product(productdto.getId(), productdto.getName(), productdto.getDescription(), productdto.getQuantity());
    }

    public static ProductDTO mapToProductDTO(Product product){
        return new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getQuantity());
    }
}
