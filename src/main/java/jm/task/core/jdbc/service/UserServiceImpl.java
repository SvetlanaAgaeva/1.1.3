package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDaoHibernate = new UserDaoHibernateImpl(Util.getSessionFactory());

    public void createUsersTable() {
        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernate.saveUser(name, lastName, age);
        System.out.println("User с именем — " + name + " " + lastName + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);

    }

    public List<User> getAllUsers() {
        List<User> users = userDaoHibernate.getAllUsers();
        System.out.println(users.toString());
        return users;
    }

    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();

    }
}
