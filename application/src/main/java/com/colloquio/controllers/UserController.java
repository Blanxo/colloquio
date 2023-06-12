package com.colloquio.controllers;

import com.colloquio.model.User;
import com.colloquio.model.UserResponseDTO;
import com.colloquio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
        consumes = MediaType.ALL_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        value = "/api/user"
)
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/create")
    public UserResponseDTO createUser(@RequestBody User user) {
        try {
            userService.create(user);
            return new UserResponseDTO("User creato correttamente", user);
        } catch (Exception e) {
            return new UserResponseDTO(e.getMessage(), user);
        }
    }

    // TODO Delete user
    // TODO Find all users

    @GetMapping(value = "/getByUsername")
    public UserResponseDTO getByUsername(@RequestParam String username) {
        try {
            User user = userService.getByUsername(username);
            return new UserResponseDTO("User ottenuto correttamente", user);
        } catch (Exception e) {
            return new UserResponseDTO(e.getMessage(), null);
        }
    }

}
