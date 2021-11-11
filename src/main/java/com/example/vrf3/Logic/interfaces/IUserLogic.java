package com.example.vrf3.Logic.interfaces;

import com.example.vrf3.Dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

public interface IUserLogic {
    ResponseEntity<UserDto> findbUsername(String username);

    ResponseEntity<HttpStatus> save(UserDto user);

    ResponseEntity<HttpStatus> delete(String username, int id);

}
