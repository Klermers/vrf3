package com.example.vrf3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class RoleDto {

    @JsonProperty("id")
    private int id;

    @JsonProperty("role")
    private String role;

}
