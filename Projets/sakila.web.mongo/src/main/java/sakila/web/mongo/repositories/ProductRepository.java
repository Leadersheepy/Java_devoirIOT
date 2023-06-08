package sakila.web.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sakila.web.mongo.entities.Panier;
import sakila.web.mongo.entities.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
    
}