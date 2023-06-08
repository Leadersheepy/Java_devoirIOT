package sakila.web.mongo.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sakila.web.mongo.repositories.PanierRepository;

@Service
    @Slf4j
public class PanierServiceImpl extends PanierService {


    public PanierServiceImpl(PanierRepository panierRepository) {
        super(panierRepository);
    }
}
