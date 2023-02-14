package br.com.pedrocorra.crudusersmysql.controller;

import br.com.pedrocorra.crudusersmysql.model.User;
import br.com.pedrocorra.crudusersmysql.service.UserService;
import br.com.pedrocorra.crudusersmysql.util.ObjectUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        try {
            ObjectUtils.isAnyFieldEmpty(user);

        } catch (IllegalAccessException ex) {
            System.out.println(ex);
        }
        return userService.create(user);
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findALl();
    }
}
