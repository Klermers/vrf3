package com.example.vrf3.Controllers;

import com.example.vrf3.Dto.UserDto;
import com.example.vrf3.Logic.interfaces.IUserLogic;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/user")
public class UserController {

    private final IUserLogic userLogic;

    public UserController(IUserLogic userLogic) {
        this.userLogic = userLogic;
    }

    @GetMapping(path = "/getuser")
    public @ResponseBody
    ResponseEntity getuser(Authentication authentication) {
        return userLogic.findbUsername(authentication.getName());
    }

    @PostMapping(path = "/register")
    public @ResponseBody
    ResponseEntity register(@RequestBody UserDto user) {
        return userLogic.save(user);
    }

    @DeleteMapping(path = "/deleteuser")
    public @ResponseBody
    ResponseEntity deleteaccount(Authentication authentication,int id) {
        return userLogic.delete(authentication.getName(),id);
    }
}
