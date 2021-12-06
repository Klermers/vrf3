package com.example.vrf3.Logic.interfaces;
import com.example.vrf3.Dto.WorldDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Set;

public interface IWorldLogic {
    ResponseEntity<Set<WorldDto>> getAll();

    ResponseEntity<HttpStatus> save(WorldDto worldDto);
}
