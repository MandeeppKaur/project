package com.Form.Signup.Service;

import com.Form.Signup.Repository.UserRepository;
import com.Form.Signup.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser()
    {
        List<User> users= new ArrayList<>();
        userRepository.findAll().forEach(user  -> users.add(user));
        return users;
    }

    public User addUser(User user)
    {
        userRepository.save(user);
        return user;
    }
}
