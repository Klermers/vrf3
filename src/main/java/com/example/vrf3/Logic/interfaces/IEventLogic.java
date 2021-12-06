package com.example.vrf3.Logic.interfaces;

import com.example.vrf3.Dto.EventDto;
import com.example.vrf3.Dto.RoleDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Set;

public interface IEventLogic {

    ResponseEntity<Set<EventDto>> getAll();

    ResponseEntity<EventDto> create(EventDto eventDto);

    ResponseEntity<EventDto> getbyId(int id);

}
