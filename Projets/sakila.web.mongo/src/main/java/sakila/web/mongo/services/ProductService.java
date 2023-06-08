package sakila.web.mongo.services;

import java.util.List;

import sakila.web.mongo.controllers.ProductController;
import sakila.web.mongo.entities.Product;

public interface ProductService {

    List<Product> getAllProduct();

    ProductController createProduct(ProductController product);

    Product createProduct(Product product);

    void deleteProduct(String productId);
}
