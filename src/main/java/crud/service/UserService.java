package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    User getUserById(long id);

    List<User> getAllUsers();
}