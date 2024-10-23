package com.example.tienda.Services;

import com.example.tienda.DTO.ProductDTO;
import com.example.tienda.Mapper.ProductMapper;
import com.example.tienda.Models.Product;
import com.example.tienda.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public ProductDTO getProduct(Long id){
        return ProductMapper.mapToProductDTO(productRepository.getReferenceById(id));


    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    public ProductDTO updateProduct(ProductDTO productDTO){
        if(productRepository.existsById(productDTO.getId())){
            return ProductMapper.mapToProductDTO(productRepository.save(ProductMapper.mapToProduct(productDTO)));
        }
        return null;
    }
}
