package sakila.web.mongo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sakila.web.mongo.entities.Panier;
import sakila.web.mongo.entities.User;
import sakila.web.mongo.services.PanierService;
import sakila.web.mongo.services.UserService;

import java.util.List;

@RestController
@CrossOrigin
public class PanierController {
    @Autowired
    private PanierService panierService;

    @GetMapping("/panier")
    public ResponseEntity<List<Panier>> getAllPanier() {
        return ResponseEntity.ok().body((List<Panier>) panierService.getAllPanier());
    }
}
