package com.example.vrf3.Logic.interfaces;

import com.example.vrf3.Database.RoleData;
import com.example.vrf3.Dto.RoleDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Set;

public interface IRoleLogic {
    ResponseEntity<Set<RoleDto>> getAll();

    ResponseEntity<HttpStatus> save(RoleDto roleDto);
}
