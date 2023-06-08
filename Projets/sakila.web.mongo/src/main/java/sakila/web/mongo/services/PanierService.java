package sakila.web.mongo.services;

import org.springframework.stereotype.Service;
import sakila.web.mongo.entities.Panier;
import sakila.web.mongo.entities.Product;
import sakila.web.mongo.repositories.PanierRepository;

import java.util.List;
@Service
public class PanierService {
    private final PanierRepository panierRepository;

    public PanierService(PanierRepository panierRepository) {
        this.panierRepository = panierRepository;
    }
    public Panier creerPanier() {
        Panier panier = new Panier();
        return panierRepository.save(panier);
    }
    public Panier ajouterArticle(String id, Product product) {
        Panier panier = panierRepository.findById(id).orElseThrow(() -> null);;
        //panier.getProduits().add(Product);
        panier.setTotal(Double.parseDouble(String.valueOf(panier.getTotal() + product.getPrice())));
        return panierRepository.save(panier);
    }

    public Panier reglerPanier(String id) {
        Panier panier = panierRepository.findById(id)
                .orElseThrow(() -> null);
        panier.setStatut("reglé");
        return panierRepository.save(panier);
    }

    public Panier abandonnerPanier(String id) {
        Panier panier = panierRepository.findById(id)
                .orElseThrow(() -> null);
        panier.setStatut("abandonné");
        return panierRepository.save(panier);
    }

    private List<Product> products;
    public List<Product> getProduits() {
        return products;
    }
    public void setProduits(List<Product> products) {
        this.products = products;
    }

    public Object getAllPanier() {
        return products;
    }
}

