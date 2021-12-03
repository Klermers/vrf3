package com.example.vrf3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.User;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class EventDto {

    @JsonProperty("id")
    private int id;

    @JsonProperty("titel")
    private String titel;

    @JsonProperty("date")
    private Date date;

    @JsonProperty("description")
    private String description;

    @JsonProperty("users")
    private UserDto userDto;

    @JsonProperty("users")
    private Date eventdate;

    @JsonProperty("worlds")
    private WorldDto worldDto;

    @JsonProperty("categories")
    private CategorieDto categorieDto;

    @JsonProperty("images")
    private Set<ImageDto> imageDtos;

    @JsonProperty("userroles")
    private Set<Event_Roles_UsersDto> event_roles_usersDtos;

}
