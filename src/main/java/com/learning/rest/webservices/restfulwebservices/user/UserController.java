package com.learning.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-service")
public class UserController {

    @Autowired
    private UserDaoService service;

    @GetMapping(path = "/users")
    public List<User> retrieveAllUser() {
        return service.getAllUser();
    }

    @GetMapping(path = "/users/{id}")
    public User retrieveOneUser(@PathVariable Integer id) {
        User user = service.fineOne(id);
        if(user == null){
            throw new UserNotFoundException("id -" + id);
            //throw new Exception();
        }
        return user;
    }

    @PostMapping(path = "/user/save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User savedUser = service.save(user);
        return new ResponseEntity(savedUser, HttpStatus.CREATED);
    }
}
