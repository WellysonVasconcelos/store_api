package project.store.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.store.api.user.User;
import project.store.api.user.UserRepository;
import project.store.api.user.userData;

@RestController
@RequestMapping("user")

public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void create(@RequestBody userData data) {

        repository.save(new User(data));
    }
}
