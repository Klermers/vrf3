package com.example.vrf3.Logic.interfaces;

import com.example.vrf3.Dto.RoleDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IRoleLogic {
    ResponseEntity<List<RoleDto>> getAll();

    ResponseEntity<HttpStatus> save(RoleDto role);

    ResponseEntity<HttpStatus> delete(int id);
}
