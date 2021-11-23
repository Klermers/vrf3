package com.example.vrf3.Logic.interfaces;
import com.example.vrf3.Dto.WorldDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IWorldLogic {
    ResponseEntity<List<WorldDto>> getAll();
    ResponseEntity<HttpStatus> delete(int id);
    ResponseEntity<HttpStatus> CreateWorld(WorldDto worldDto);
}
