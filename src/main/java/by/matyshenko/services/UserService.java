package by.matyshenko.services;

import by.matyshenko.dao.implementation.UserDaoImpl;
import by.matyshenko.dao.interfaces.UserDao;
import by.matyshenko.models.Auto;
import by.matyshenko.models.User;

import java.util.List;

public class UserService {

    private UserDao userDao = new UserDaoImpl();

    public UserService(){

    }

    public User findUser(int id){
        return userDao.findById(id);
    }

    public void saveUser(User user){
        userDao.save(user);
    }

    public void deleteUser(User user){
        userDao.delete(user);
    }

    public void updateUser(User user){
        userDao.update(user);
    }

    public List<User> findAllUaers(){
        return userDao.findAll();
    }

    public Auto findAutoById(int id){
        return userDao.findAutoById(id);
    }

}
