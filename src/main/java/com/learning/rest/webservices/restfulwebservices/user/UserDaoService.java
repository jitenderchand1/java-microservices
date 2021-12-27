package com.learning.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Component
public class UserDaoService {
    private static List<User> users = new ArrayList();

    private Integer userCount = 4;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "eve", new Date()));
        users.add(new User(3, "jack", new Date()));
        users.add(new User(4, "hack", new Date()));
    }

    public List<User> getAllUser() {
        return users;
    }

    public User save(User user) {
        if(user.getId() == null){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User fineOne(Integer id) {
        for(User user: users){
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
