package com.marcosDev.Transaction_api.rest;

import com.marcosDev.Transaction_api.domain.dtos.UsersDto;
import com.marcosDev.Transaction_api.services.UsersService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

        private final UsersService userService;

        public UsersController(UsersService usersService) {

            this.userService = usersService;
        }

        @PostMapping
        public ResponseEntity<String> registerUser(@RequestBody @Valid UsersDto usersDto) {
            userService.Users(usersDto);
            return ResponseEntity.ok("User registered successfully.");
        }


}
