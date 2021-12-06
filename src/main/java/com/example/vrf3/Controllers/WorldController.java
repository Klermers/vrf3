package com.example.vrf3.Controllers;

import com.example.vrf3.Dto.UserDto;
import com.example.vrf3.Dto.WorldDto;
import com.example.vrf3.Logic.WorldLogic;
import com.example.vrf3.Logic.interfaces.IUserLogic;
import com.example.vrf3.Logic.interfaces.IWorldLogic;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/world")
public class WorldController {

    private final IWorldLogic worldLogic;

    public WorldController(IWorldLogic worldLogic) {
        this.worldLogic = worldLogic;
    }

    @GetMapping(path = "/worlds")
    public @ResponseBody
    ResponseEntity GetWorlds() {
        return worldLogic.getAll();
    }


    @PostMapping(path = "/saveworld")
    public @ResponseBody
    ResponseEntity SaveWorld(@RequestBody WorldDto world) {
        return worldLogic.save(world);
    }
}
