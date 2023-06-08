package sakila.web.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import sakila.web.mongo.entities.Panier;

public interface PanierRepository extends MongoRepository<Panier,String> {
}
