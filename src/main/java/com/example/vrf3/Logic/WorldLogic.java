package com.example.vrf3.Logic;

import com.example.vrf3.Database.WorldData;
import com.example.vrf3.Dto.CategorieDto;
import com.example.vrf3.Dto.WorldDto;
import com.example.vrf3.Logic.interfaces.IWorldLogic;
import com.example.vrf3.Mapstruct.MapStructMapperImpl;
import com.example.vrf3.Repositoy.WorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class WorldLogic implements IWorldLogic {

    @Autowired
    private WorldRepository worldRepository;

    @Autowired
    private MapStructMapperImpl mapStructMapper;

    @Override
    public ResponseEntity<Set<WorldDto>> getAll() {
        Set<WorldDto> worldDtos = new HashSet<>();
        try {
            worldDtos = mapStructMapper.WorldDataToWorldDTos(worldRepository.findAll());
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(worldDtos,HttpStatus.OK);
    }
}
