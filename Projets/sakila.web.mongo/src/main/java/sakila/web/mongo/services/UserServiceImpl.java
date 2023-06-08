package sakila.web.mongo.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sakila.web.mongo.entities.User;
import sakila.web.mongo.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
    @Slf4j
        @AllArgsConstructor
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(String userId) {
        Optional<User> userDb = this.userRepository.findById(userId);

        if (userDb.isPresent()) {
             this.userRepository.delete(userDb.get());
        } else {
            System.out.println("Erreur, cet user n'existe pas");
        }
    }
}
