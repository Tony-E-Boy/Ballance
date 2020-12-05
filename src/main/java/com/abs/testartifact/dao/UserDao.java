package com.abs.testartifact.dao;

import com.abs.testartifact.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserDao {

    private SessionFactory factory;

    public void create(User user) {
        Session session = factory.getCurrentSession();
        session.save(user);
    }

    public User read(int id) {
        Session session = factory.getCurrentSession();
        List<User> users = session.createQuery(String.format("from User u where u.id =%d", id)).list();
        return (User) users.stream().findAny().get();
    }

    public List<User> readAll() {
        Session session = factory.getCurrentSession();
        List<User> users = session.createQuery("from User").list();
        System.out.println(users);
        return users;
    }

    public void delete(Long id) {
        Session session = factory.getCurrentSession();
        User userForDelete = session.get(User.class, id);
        session.delete(userForDelete);
    }

    public void update(Long id, User user) {
        Session session = factory.getCurrentSession();
        User userForUpdate = session.get(User.class, id);
        userForUpdate.setName(user.getName());
        userForUpdate.setEmail(user.getEmail());
        userForUpdate.setHex(user.getHex());
    }
}
