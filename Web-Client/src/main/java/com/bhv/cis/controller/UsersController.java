package com.bhv.cis.controller;

import com.bhv.cis.dto.UserDTO;
import com.bhv.cis.service.UsersService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/Users")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    // GET /api/users - get all users
    @GetMapping
    public Flux<UserDTO> getAllUsers() {
        return usersService.getUsers();
    }

    // GET /api/users/{id} - get user by ID
    @GetMapping("/{id}")
    public Mono<UserDTO> getUserById(@PathVariable String id) {
        return usersService.getUser(id);
    }
}
