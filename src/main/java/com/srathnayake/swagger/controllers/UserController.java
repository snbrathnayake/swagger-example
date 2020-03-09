package com.srathnayake.swagger.controllers;

import com.srathnayake.swagger.models.User;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by snbrathnayake on 2/28/2020
 **/
@RestController
@RequestMapping("/rest/user")
@Api(value = "User Resource",description = "This API for User Information" )
public class UserController {


    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() {
        return Arrays.asList(
                new User("Peter", 2000L),
                new User("Sam", 1000L)
        );
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{username}")
    public User getUser(@PathVariable("username") final String username ) {
        return  new User(username , 1000L );
    }
}
