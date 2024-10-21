package com.example.tienda.Controller;

import com.example.tienda.DTO.ProductDTO;
import com.example.tienda.Services.ProductService;
import com.example.tienda.Services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<?> createEmployee(@RequestBody ProductDTO productdto){
        ProductDTO createdProduct = productService.createProduct(productdto);
        return ResponseEntity.ok(createdProduct);
    }
}
