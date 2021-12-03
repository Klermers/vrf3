package com.example.vrf3.Logic;

import com.example.vrf3.Database.EventData;
import com.example.vrf3.Database.RoleData;
import com.example.vrf3.Database.UserData;
import com.example.vrf3.Dto.EventDto;
import com.example.vrf3.Dto.GetUserDto;
import com.example.vrf3.Dto.RoleDto;
import com.example.vrf3.Dto.UserDto;
import com.example.vrf3.Logic.interfaces.IRoleLogic;
import com.example.vrf3.Mapstruct.MapStructMapperImpl;
import com.example.vrf3.Repositoy.RoleRepository;
import com.example.vrf3.Repositoy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleLogic implements IRoleLogic {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private MapStructMapperImpl mapStructMapper;

    @Override
    public ResponseEntity<Set<RoleDto>> getAll() {
        Set<RoleDto> roles = new HashSet<>();
        try {
            roles = mapStructMapper.RoleDataToRoleDtos(roleRepository.findAll());
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(roles,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HttpStatus> save(RoleDto roleDto) {
        try {
            roleRepository.save(mapStructMapper.RoleDtoToRoleData(roleDto));
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
