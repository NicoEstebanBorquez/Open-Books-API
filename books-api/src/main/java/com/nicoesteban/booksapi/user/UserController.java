package com.nicoesteban.booksapi.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This class implements a REST API to perform User's related actions
 */

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> postUser(@RequestBody UserDTO userDTO) {
        //Check if the user already exist for that email, otherwise create it
        return ResponseEntity.ok(userRepository.findUserByEmail(userDTO.getEmail())
                .orElseGet(() -> {
                    log.info("Creating new user with email {}", userDTO.getEmail());
                    return userRepository.save(new User(userDTO.getEmail(), userDTO.getPassword()));
                }));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(userRepository.findById(id).orElse(null));
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok((List<User>) userRepository.findAll());
    }


}
