package com.example.vrf3.Controllers;

import com.example.vrf3.Dto.RoleDto;
import com.example.vrf3.Dto.WorldDto;
import com.example.vrf3.Logic.interfaces.IRoleLogic;
import com.example.vrf3.Logic.interfaces.IUserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/role")
public class RoleController {

    private final IRoleLogic roleLogic;

    public RoleController(IRoleLogic roleLogic) {
        this.roleLogic = roleLogic;
    }

    @GetMapping(path = "/roles")
    public @ResponseBody
    ResponseEntity GetRoles() {
        return roleLogic.getAll();
    }

    @PostMapping(path = "/saverole")
    public @ResponseBody
    ResponseEntity SaveWorld(@RequestBody RoleDto roleDto) {
        return roleLogic.save(roleDto);
    }
}
