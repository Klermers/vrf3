package com.example.vrf3.Dto;

import com.example.vrf3.Database.EventData;

import java.util.Set;

public class CategorieDto {
    private  int Id;

    private  String category;

    private Set<EventDto> eventDtos;

    public CategorieDto(){

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<EventDto> getEventDtos() {
        return eventDtos;
    }

    public void setEventDtos(Set<EventDto> eventDtos) {
        this.eventDtos = eventDtos;
    }
}
