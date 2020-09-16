package com.bookstore.user.service;

import com.bookstore.user.model.User;
import com.bookstore.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;



    public List<User> getAllUsers()
    {
        List<User> users= (List<User>) userRepository.findAll();
        return users;
    }

    public User adduser(final User user)
    {
        return userRepository.save(user);
    }

    public User getUserByEmail(final String email)
    {

        User user=userRepository.finduserByEmail(email);
        return user;
    }

    public User getUserByEmailAndPassword(final String email,final String password)
    {
        User user=userRepository.finduserByEmailandPassword(email,password);
        System.out.println(user);
        return user;
    }

    public void deleteUser(final String email)
    {
        User user=new User();
        user.setEmail(email);
        userRepository.delete(user);
    }


}
