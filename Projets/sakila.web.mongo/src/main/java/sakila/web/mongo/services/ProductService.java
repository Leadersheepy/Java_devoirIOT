package sakila.web.mongo.services;

import java.util.List;

import sakila.web.mongo.controllers.ProductController;
import sakila.web.mongo.model.ProductModel;

public interface ProductService {

    List<ProductController> getAllProduct();

    ProductController createProduct(ProductController product);

    void deleteProduct(String productId);
}
