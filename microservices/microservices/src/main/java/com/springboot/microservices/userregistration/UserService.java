package com.springboot.microservices.userregistration;

import java.util.List;


public interface UserService {
    void saveUser(UserDTO userDto);

    User findUserByEmail(String email);

    List<UserDTO> findAllUsers();
}
