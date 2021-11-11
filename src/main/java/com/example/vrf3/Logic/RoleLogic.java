package com.example.vrf3.Logic;

import com.example.vrf3.Database.EventData;
import com.example.vrf3.Database.RoleData;
import com.example.vrf3.Database.UserData;
import com.example.vrf3.Dto.EventDto;
import com.example.vrf3.Dto.RoleDto;
import com.example.vrf3.Dto.UserDto;
import com.example.vrf3.Logic.interfaces.IRoleLogic;
import com.example.vrf3.Repositoy.RoleRepository;
import com.example.vrf3.Repositoy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleLogic implements IRoleLogic {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public ResponseEntity<List<RoleDto>> getAll() {
        List<RoleDto> roles = new ArrayList<>();
        roleRepository.findAll().forEach(role -> {
            roles.add(populateDto(role));
        });
        return new ResponseEntity<>(roles,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HttpStatus> save(RoleDto role) {
        try {
            roleRepository.save(populateEntity(role));
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HttpStatus> delete(int id) {
        try {
            roleRepository.deleteById(id);
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);

    }

    private RoleDto populateDto(RoleData roledata) {
        return new RoleDto(
                roledata.getId(),
                roledata.getRole(),
                getEvents(roledata.getEvents())

        );
    }

    private RoleData populateEntity(RoleDto dto) {
        return new RoleData(
                dto.getRole()
        );
    }

    private Set<EventDto> getEvents(Set<EventData> eventdatas)
    {
        Set<EventDto> eventdtos = new HashSet<>();
        for (EventData eventdata: eventdatas)
        {
            EventDto eventDto = new EventDto(
                    eventdata.getId()
            );

        }
        return eventdtos;
    }
}
