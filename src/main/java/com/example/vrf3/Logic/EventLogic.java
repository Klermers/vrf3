package com.example.vrf3.Logic;

import com.example.vrf3.Dto.EventDto;
import com.example.vrf3.Logic.interfaces.IEventLogic;
import com.example.vrf3.Mapstruct.MapStructMapperImpl;
import com.example.vrf3.Repositoy.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EventLogic implements IEventLogic {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private MapStructMapperImpl mapStructMapper;

    @Override
    public ResponseEntity<Set<EventDto>> getAll()
    {
        Set<EventDto> events;
        try {
            events = mapStructMapper.EventDataToEventDtos(eventRepository.findAll());
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(events,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EventDto> create(EventDto eventDto) {
        try {
            eventRepository.save(mapStructMapper.EventDtoToEventData(eventDto));
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
            eventDto = mapStructMapper.EventDataToEventDto(eventRepository.findById(id));
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(eventDto, HttpStatus.OK);
    }
}
