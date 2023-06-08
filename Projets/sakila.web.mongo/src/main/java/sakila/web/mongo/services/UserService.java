package sakila.web.mongo.services;

import sakila.web.mongo.entities.User;

import java.util.List;

public interface UserService {
    
    List<User> getAllUser();
    
    User createUser(User user);

    void deleteUser(String userId);

}