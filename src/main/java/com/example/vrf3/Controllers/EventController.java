package com.example.vrf3.Controllers;

import com.example.vrf3.Dto.EventDto;
import com.example.vrf3.Dto.UserDto;
import com.example.vrf3.Logic.interfaces.IEventLogic;
import com.example.vrf3.Logic.interfaces.IRoleLogic;
import com.example.vrf3.Logic.interfaces.IUserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/event")
public class EventController {

    private final IEventLogic eventLogic;

    public EventController(IEventLogic eventLogic) {
        this.eventLogic = eventLogic;
    }


    @PostMapping(path = "/createevent")
    public @ResponseBody
    ResponseEntity CreateEvent(@RequestBody EventDto eventDto) {
        return eventLogic.getbyId(eventDto.getId());
    }

    @GetMapping(path = "/getevents")
    public @ResponseBody
    ResponseEntity GetEvents() {
        return eventLogic.getAll();
    }

    @GetMapping(path = "/getevent")
    public @ResponseBody
    ResponseEntity GetEvents(@RequestBody EventDto eventDto) {
        return eventLogic.getbyId(eventDto.getId());
    }


}
