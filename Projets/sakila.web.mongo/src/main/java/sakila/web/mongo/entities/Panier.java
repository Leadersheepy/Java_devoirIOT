package sakila.web.mongo.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "paniers")
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Panier {
    @Id
    private String id;
    private String idDuProduit;
    private String statut;
    private String regler;
    private Number prix;
    private double total;

    private List<Product> produits;

    public Panier() {
        this.statut = "en_cours";
        this.total = 0.0;
    }
}
