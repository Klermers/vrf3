package com.example.vrf3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class GetUserDto {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("username")
    private String username;

    @NotNull
    @JsonProperty("displayname")
    private String displayname;

    @NotNull
    @JsonProperty("joindate")
    private Date joindate;

    @NotNull
    @JsonProperty("image")
    private ImageDto imagesData;
}
