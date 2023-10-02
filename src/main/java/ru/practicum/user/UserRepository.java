package ru.practicum.user;

import java.util.List;

public interface UserRepository {

    List<User> getAllUsers();

    User save(User user);

}
