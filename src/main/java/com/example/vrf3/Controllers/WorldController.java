package com.example.vrf3.Controllers;

import com.example.vrf3.Logic.interfaces.IUserLogic;
import com.example.vrf3.Logic.interfaces.IWorldLogic;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
