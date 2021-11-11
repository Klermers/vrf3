package com.example.vrf3.Logic;

import com.example.vrf3.Database.EventData;
import com.example.vrf3.Database.RoleData;
import com.example.vrf3.Database.UserData;
import com.example.vrf3.Dto.EventDto;
import com.example.vrf3.Dto.RoleDto;
import com.example.vrf3.Dto.UserDto;
import com.example.vrf3.Logic.interfaces.IEventLogic;
import com.example.vrf3.Repositoy.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class EventLogic implements IEventLogic {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public ResponseEntity<List<EventDto>> getAll()
    {
        List<EventDto> events = new ArrayList<>();
        eventRepository.findAll().forEach(role -> {
            events.add(populateDto(role));
        });
        return new ResponseEntity<>(events,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EventDto> create(EventDto eventDto) {
        try {
            eventRepository.save(populateEntity(eventDto));
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EventDto> getbyId(int id) {
        EventDto eventDto;
        try {
            eventDto = populateDto(eventRepository.findById(id));
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(eventDto, HttpStatus.OK);
    }


    @Override
    public ResponseEntity<HttpStatus> delete(int id) {
        try {
            eventRepository.deleteById(id);
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private EventDto populateDto(EventData eventdata) {
        return new EventDto(
                eventdata.getId(),
                eventdata.getTitel(),
                eventdata.getDescription(),
                eventdata.getEventdate(),
                getUsers(eventdata.getUsers()),
                getRoles(eventdata.getRoles())

        );
    }

    private EventData populateEntity(EventDto dto) {
        return new EventData(
                dto.getTitel(),
                dto.getDate(),
                dto.getDescription()
        );
    }

    private Set<RoleDto> getRoles(Set<RoleData> roledatas) {
        Set<RoleDto> roledtos = new HashSet<>();
        for (RoleData roledata : roledatas) {
            RoleDto roledto = new RoleDto(
                    roledata.getId(),
                    roledata.getRole(),
                    getEvents(roledata.getEvents())
            );

        }
        return roledtos;
    }

    private Set<UserDto> getUsers(Set<UserData> userdatas) {
        Set<UserDto> userdtos = new HashSet<>();
        for (UserData userdata : userdatas) {
            UserDto userdto = new UserDto(
                    userdata.getId(),
                    userdata.getDisplayname()
            );

        }
        return userdtos;
    }

    private Set<EventDto> getEvents(Set<EventData> eventdatas) {
        Set<EventDto> eventdtos = new HashSet<>();
        for (EventData eventdata : eventdatas) {
            EventDto eventDto = new EventDto(
                    eventdata.getId()
            );

        }
        return eventdtos;
    }
}
