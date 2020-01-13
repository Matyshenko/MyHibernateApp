package by.matyshenko;

import by.matyshenko.models.Auto;
import by.matyshenko.models.User;
import by.matyshenko.services.UserService;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        User userPetia = new User("Petia", 26);
        userService.saveUser(userPetia);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(userPetia);
        userPetia.addAuto(ferrari);

        Auto ford = new Auto("Ford", "black");
        ferrari.setUser(userPetia);
        userPetia.addAuto(ford);
        userService.updateUser(userPetia);

    }
}
