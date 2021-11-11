package com.example.vrf3.Logic.interfaces;

import com.example.vrf3.Dto.EventDto;
import com.example.vrf3.Dto.RoleDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IEventLogic {

    ResponseEntity<List<EventDto>> getAll();

    ResponseEntity<EventDto> create(EventDto eventDto);

    ResponseEntity<EventDto> getbyId(int id);

    ResponseEntity<HttpStatus> delete(int id);

}
