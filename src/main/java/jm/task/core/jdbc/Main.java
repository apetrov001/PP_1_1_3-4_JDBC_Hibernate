package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Andrey", "Ivanov", (byte) 20);
        userService.saveUser("Sergey", "Sidorov", (byte) 21);
        userService.saveUser("Simon", "Gordeev", (byte) 22);
        userService.saveUser("Alexey", "Kuznetsov", (byte) 23);
        userService.removeUserById(1);
        userService.getAllUsers().forEach(System.out::println);
        //System.out.println(userService.getAllUsers().toString());
        userService.cleanUsersTable();
        userService.dropUsersTable();




    }

}

