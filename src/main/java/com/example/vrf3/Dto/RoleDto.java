package com.example.vrf3.Dto;

import java.util.Set;

public class RoleDto {

    private int id;

    private String role;

    private Set<Event_Roles_UsersDto> event_roles_usersDtos;

    public RoleDto()
    {

    }

    public RoleDto(int Id, String Role)
    {
        this.id = Id;
        this.role = Role;
    }

    public RoleDto(int Id, String Role, Set<Event_Roles_UsersDto> Event_roles_usersDtos)
    {
        this.id = Id;
        this.role = Role;
        this.event_roles_usersDtos = Event_roles_usersDtos;
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

    public Set<Event_Roles_UsersDto> getEvent_roles_usersDtos() {
        return event_roles_usersDtos;
    }

    public void setEvent_roles_usersDtos(Set<Event_Roles_UsersDto> event_roles_usersDtos) {
        this.event_roles_usersDtos = event_roles_usersDtos;
    }
}
