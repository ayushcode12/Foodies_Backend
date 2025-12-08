package com.aj.foodiesapi.Controller;

import com.aj.foodiesapi.Service.UserService;
import com.aj.foodiesapi.io.UserRequest;
import com.aj.foodiesapi.io.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse register(@RequestBody UserRequest request){
        return userService.registerUser(request);
    }

}
