package sakila.web.mongo.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sakila.web.mongo.entities.Panier;
import sakila.web.mongo.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
    @Slf4j
        @AllArgsConstructor

public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Override
    public List<Panier.Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Panier.Product createProduct(Panier.Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(String productId) {
        Optional<Panier.Product> productDb = this.productRepository.findById(productId);

        if (productDb.isPresent()) {
            this.productRepository.delete(productDb.get());
        } else {
            System.out.println("Erreur, ce produit n'existe pas");
        }
    }
    
}
