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

    @JsonProperty("worlds")
    private WorldDto worldData;

    @JsonProperty("categories")
    private CategorieDto categoriesData;

    @JsonProperty("images")
    private Set<ImageDto> imagesData;

    @JsonProperty("userroles")
    private Set<Event_Roles_UsersDto> usersrole;

}
