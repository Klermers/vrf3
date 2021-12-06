package com.example.vrf3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageDto {
    @JsonProperty("id")
    private Integer id;

    @NotNull
    @JsonProperty("image")
    private String image;
}
