package com.example.vrf3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class UserDto {

    @JsonProperty("id")
    private Integer id;

    @NotNull
    @JsonProperty("username")
    private String username;

    @NotNull
    @JsonProperty("password")
    private String password;

    @NotNull
    @JsonProperty("displayname")
    private String displayname;

    @JsonProperty("image")
    private ImageDto imagesData;

    @NotNull
    @JsonProperty("joindate")
    private Date joindate;
}
