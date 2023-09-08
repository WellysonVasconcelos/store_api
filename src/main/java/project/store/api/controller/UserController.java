package project.store.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.store.api.user.userData;

@RestController
@RequestMapping("user")

public class UserController {
    @PostMapping
    public void create(@RequestBody userData data){

        System.out.println(data);
    }
}
