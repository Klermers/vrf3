package com.example.vrf3.Dto;

import com.example.vrf3.Database.EventData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class CategorieDto {

    @JsonProperty("id")
    private  int id;

    @JsonProperty("categorie")
    private  String categorie;

}
