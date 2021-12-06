package com.example.vrf3.Logic;

import com.example.vrf3.Database.Event_Roles_UsersData;
import com.example.vrf3.Dto.Event_Roles_UsersDto;
import com.example.vrf3.Logic.interfaces.IEvent_Roles_UsersLogic;
import com.example.vrf3.Mapstruct.MapStructMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class Event_Roles_UsersLogic implements IEvent_Roles_UsersLogic {

    @Autowired
    private MapStructMapperImpl mapStructMapper;

    @Override
    public ResponseEntity<Set<Event_Roles_UsersDto>> GetallbyEventId(int id) {
        return null;
    }
}
