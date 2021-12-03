package com.example.vrf3.Logic;

import com.example.vrf3.Database.EventData;
import com.example.vrf3.Database.UserData;
import com.example.vrf3.Dto.EventDto;
import com.example.vrf3.Dto.GetUserDto;
import com.example.vrf3.Dto.UserDto;
import com.example.vrf3.Dto.WorldDto;
import com.example.vrf3.Logic.interfaces.IUserLogic;
import com.example.vrf3.Mapstruct.MapStructMapperImpl;
import com.example.vrf3.Repositoy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

import static java.util.Collections.emptyList;

@Service
public class UserLogic implements IUserLogic, UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MapStructMapperImpl mapStructMapper;

    private final BCryptPasswordEncoder encoder;

    public UserLogic() {
        encoder = new BCryptPasswordEncoder();
    }

    @Override
    public ResponseEntity<GetUserDto> findbUsername(String username) {
        GetUserDto user;
        try {
            user = mapStructMapper.UserDataToGetUserDto(userRepository.findByUsername(username));
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Set<GetUserDto>> GetAllUsers() {
        Set<GetUserDto> getUserDtos = new HashSet<>();
        try {
            getUserDtos = mapStructMapper.UserDataToGetUserDtos(userRepository.findAll());
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(getUserDtos,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HttpStatus> save(UserDto user) {
        user.setPassword(encoder.encode(user.getPassword()));
        try {
            userRepository.save(mapStructMapper.UserDtoToUserData(user));
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserData user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), emptyList());
    }
}
