package com.example.vrf3.Controllers;

import com.example.vrf3.Logic.interfaces.IRoleLogic;
import com.example.vrf3.Logic.interfaces.IUserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/event")
public class RoleController {

    private final IRoleLogic roleLogic;

    public RoleController(IRoleLogic roleLogic) {
        this.roleLogic = roleLogic;
    }
}
