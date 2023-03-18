package com.blog.api.blogapi.service;

import com.blog.api.blogapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    List<User> users = new ArrayList<>(Arrays.asList(
            new User(1, "Jack", "jack@yahoo.com"),
            new User(2, "James", "james@yahoo.com")
    ));

    public List<User> getAllUsers() {
        return this.users;
    }

    public Optional<User> getUserByid(Integer id) {
        return this.users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }
}
