package com.aj.foodiesapi.Service;

import com.aj.foodiesapi.io.UserRequest;
import com.aj.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();

}
