package com.example.vrf3.Logic.interfaces;

import com.example.vrf3.Dto.GetUserDto;
import com.example.vrf3.Dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

import java.util.Set;

public interface IUserLogic {
    ResponseEntity<GetUserDto> findbUsername(String username);

    ResponseEntity<Set<GetUserDto>> GetAllUsers();

    ResponseEntity<HttpStatus> save(UserDto user);

}
