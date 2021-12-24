package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        userService.createUsersTable();

        User aleksei = new User("Aleksei", "Bissing", (byte)42);
        User igor = new User("Igor", "Akulov", (byte)41);
        User aleksandr = new User("Aleksandr", "Zimin", (byte)35);
        User andrew = new User("Andrew", "Yakovlev", (byte)37);

        userService.saveUser(aleksei.getName(), aleksei.getLastName(), aleksei.getAge());
        userService.saveUser(igor.getName(), igor.getLastName(), igor.getAge());
        userService.saveUser(aleksandr.getName(), aleksandr.getLastName(), aleksandr.getAge());
        userService.saveUser(andrew.getName(), andrew.getLastName(), andrew.getAge());


        for (User users: userService.getAllUsers()) {
            System.out.println(users);
        }

       userService.cleanUsersTable();
        //userService.dropUsersTable();
    }
}
