package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser
    // constructor
    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    /**
     * Getter
     * @return
     */
    public List<User> getUsers() {
        // TODO: A modifier
        //use the getUsers from the ApiService
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // TODO: A modifier
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: A modifier
        apiService.deleteUser(user);
    }
}
