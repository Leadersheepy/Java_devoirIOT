package sakila.web.mongo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sakila.web.mongo.entities.Panier;
import sakila.web.mongo.services.ProductService;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Panier.Product>> getAllProduct() {
        return ResponseEntity.ok().body(productService.getAllProduct());
    }

    @PostMapping("/products")
    public ResponseEntity<Panier.Product> createProduct(@RequestBody Panier.Product product) {
        return ResponseEntity.ok().body(this.productService.createProduct(product));
    }

    @DeleteMapping("/products/{id}")
    public HttpStatus deleteProduct(@PathVariable String id) {
        this.productService.deleteProduct(id);
        return HttpStatus.OK;
    }
}