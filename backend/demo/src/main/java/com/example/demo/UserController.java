package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/user")
public class UserController {
    private UsuarioService userService;

    public UserController(UsuarioService userService) {
        this.userService = userService;
    }

    @RequestMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/{id}")
    public Optional<User> getUserById(Long id) {
        return userService.getUserById(id);
    }


    @RequestMapping("/email/{email}")
    public User getUserByEmail(String email) {
        return userService.getUserByEmail(email);
    }

    @RequestMapping("/save")
    public User saveUser(User user) {
        return userService.saveUser(user);
    }

    @RequestMapping("/delete/{id}")
    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }



}
