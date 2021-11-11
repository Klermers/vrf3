package com.example.vrf3.Dto;

import java.util.Set;

public class RoleDto {

    int id;

    String role;

    Set<EventDto> events;

    public RoleDto()
    {

    }

    public RoleDto(int Id, String Role)
    {
        this.id = Id;
        this.role = Role;
    }

    public RoleDto(int Id, String Role, Set<EventDto> events)
    {
        this.id = Id;
        this.role = Role;
        this.events = events;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String Role) {
        this.role = Role;
    }

    public Set<EventDto> getEvents() {
        return events;
    }

    public void setEvents(Set<EventDto>  Events) {
        this.events = Events;
    }

}
