package com.example.vrf3.Logic;

import com.example.vrf3.Database.EventData;
import com.example.vrf3.Database.UserData;
import com.example.vrf3.Dto.EventDto;
import com.example.vrf3.Dto.UserDto;
import com.example.vrf3.Logic.interfaces.IUserLogic;
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

    private final BCryptPasswordEncoder encoder;

    public UserLogic() {
        encoder = new BCryptPasswordEncoder();
    }

    @Override
    public ResponseEntity<UserDto> findbUsername(String username) {
        UserDto user;
        try {
            user = populateDto(userRepository.findByUsername(username));
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HttpStatus> save(UserDto user) {
        user.setPassword(encoder.encode(user.getPassword()));
        try {
            userRepository.save(populateEntity(user));
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HttpStatus> delete(String username, int id) {
        try {
            if(findbUsername(username).getBody().getId() == id)
            {
                userRepository.deleteById(id);
            }
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

    private UserDto populateDto(UserData userdata) {
        return new UserDto(
                userdata.getId(),
                getEvents(userdata.getEvents()),
                userdata.getDisplayname()
        );
    }

    private UserData populateEntity(UserDto dto) {
        return new UserData(
                dto.getUsername(),
                dto.getPassword(),
                dto.getDisplayname()
        );
    }

    private Set<EventDto> getEvents(Set<EventData> eventdatas) {
        Set<EventDto> eventdtos = new HashSet<>();
        for (EventData eventdata : eventdatas) {
            EventDto eventDto = new EventDto(
                    eventdata.getId(),
                    eventdata.getTitel(),
                    eventdata.getEventdate()
            );

        }
        return eventdtos;
    }
}
