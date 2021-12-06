package com.example.vrf3.Logic.interfaces;

import com.example.vrf3.Dto.Event_Roles_UsersDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Set;

public interface IEvent_Roles_UsersLogic {
    ResponseEntity<Set<Event_Roles_UsersDto>> GetallbyEventId(int id);
}
