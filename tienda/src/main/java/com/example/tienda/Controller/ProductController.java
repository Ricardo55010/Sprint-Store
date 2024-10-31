package com.example.tienda.Controller;

import com.example.tienda.DTO.ProductDTO;
import com.example.tienda.Models.Product;
import com.example.tienda.Services.ProductService;
import com.example.tienda.Services.ProductServiceImpl;
import com.microsoft.demo.Demo;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/product/{id}")
    public ResponseEntity<?> getProduct(@PathVariable Long id){
        return ResponseEntity.ok(productService.getProduct(id));
    }

    @GetMapping("/product/all")
    public ResponseEntity<?> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }
    @DeleteMapping("/product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return ResponseEntity.ok(null);
    }

    @PatchMapping("/product")
    public ResponseEntity<?> updateProduct(@RequestBody ProductDTO productdto){
        return ResponseEntity.ok(productService.updateProduct(productdto));
    }
    @GetMapping("/saludo/{saludo}")
    public ResponseEntity<?> getSaludo(@PathVariable String saludo){
        Demo demo = new Demo();
        demo.DoSomething(true);
        return ResponseEntity.ok("Si");
    }

}
