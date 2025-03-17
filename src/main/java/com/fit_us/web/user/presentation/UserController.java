package com.fit_us.web.user.presentation;

import com.fit_us.web.user.application.UserService;
import com.fit_us.web.user.application.dto.CreateUserCommand;
import com.fit_us.web.user.application.dto.UserDtoMapper;
import com.fit_us.web.user.domain.User;
import com.fit_us.web.user.presentation.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /**
     * 추 후, auth에서 받고 event driven으로 처리해도 될듯
     */
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    UserResponse createUser(@RequestBody CreateUserCommand command){
        User user = userService.create(command);
        return UserDtoMapper.toResponse(user);
    }
    @PatchMapping()
    ResponseEntity<Void> updateUser(){
        return null;
    }
    @DeleteMapping()
    ResponseEntity<Void> deleteUser(){
        return null;
    }
}
