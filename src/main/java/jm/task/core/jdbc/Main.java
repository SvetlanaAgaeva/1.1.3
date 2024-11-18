package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Svetlana", "Agaeva", (byte) 48);
        userService.saveUser("Musya", "Cat", (byte) 15);
        userService.saveUser("Plyusha", "Cat", (byte) 4);
        userService.saveUser("Manya", "Budgie", (byte) 6);
        userService.getAllUsers();
//        userService.cleanUsersTable();
//        userService.dropUsersTable();


    }
}
