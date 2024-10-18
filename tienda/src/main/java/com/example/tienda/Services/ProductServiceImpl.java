package com.example.tienda.Services;

import com.example.tienda.DTO.ProductDTO;
import com.example.tienda.Mapper.ProductMapper;
import com.example.tienda.Models.Product;
import com.example.tienda.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductDTO createProduct(ProductDTO productdto) {
        Product product = ProductMapper.mapToProduct(productdto);
        Product createProduct = productRepository.save(product);
        return ProductMapper.mapToProductDTO(createProduct);
    }
}
