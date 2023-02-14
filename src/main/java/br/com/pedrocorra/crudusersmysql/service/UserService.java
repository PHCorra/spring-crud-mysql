package br.com.pedrocorra.crudusersmysql.service;

import br.com.pedrocorra.crudusersmysql.model.User;
import br.com.pedrocorra.crudusersmysql.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User create(@RequestBody User user) {
        /*
        * var userCreated = new User();
        * userCreated.setName(user.getName);
        * userCreated.setEmail(user.getEmail);
        * userCreated.setPassword(user.getPassword();
        * return userRepository.save(userCreated);
        * */
        return userRepository.save(user);
    }

    public List<User> findALl() {
        var users = userRepository.findAll();
        return users;
    }




}
