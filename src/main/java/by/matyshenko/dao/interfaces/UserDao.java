package by.matyshenko.dao.interfaces;

import by.matyshenko.models.Auto;
import by.matyshenko.models.User;

import java.util.List;

public interface UserDao {
    User findById(int id);

    void save(User user);

    void update(User user);

    void delete(User user);

    Auto findAutoById(int id);

    List<User> findAll();
}
