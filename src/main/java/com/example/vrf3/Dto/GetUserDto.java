package com.example.vrf3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

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
    @JsonProperty("image")
    private ImageDto imageDto;
}
