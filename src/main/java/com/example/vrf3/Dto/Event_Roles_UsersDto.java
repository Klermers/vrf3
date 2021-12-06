package com.example.vrf3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Event_Roles_UsersDto {

    @JsonProperty("id")
    private int id;

    @JsonProperty("events")
    private EventDto eventData;

    @JsonProperty("roles")
    private RoleDto roledata;

    @JsonProperty("users")
    private GetUserDto userData;

}
