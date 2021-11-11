package com.example.vrf3.Dto;

import java.util.Date;
import java.util.Set;

public class EventDto {

    int id;

    String titel;

    String description;

    Date date;

    Set<UserDto> users;

    Set<RoleDto> roles;

    public EventDto(){

    }
    public EventDto(int Id, String Titel, String Description, Date date, Set<UserDto> Users, Set<RoleDto> Roles){
        this.id = Id;
        this.titel = Titel;
        this.description= Description;
        this.date = date;
        this.users = users;
        this.roles = roles;

    }

    public EventDto(String Titel, String Description, Date date){
        this.titel = Titel;
        this.description= Description;
        this.date = date;
    }
    public EventDto(int Id, String Titel, String Description, Date date, Set<UserDto> Users){
        this.id = Id;
        this.titel = Titel;
        this.description= Description;
        this.date = date;
        this.users = users;
    }

    public EventDto(int Id, String Titel, Date date){
        this.id = Id;
        this.titel = Titel;
        this.date = date;
    }

    public EventDto(int Id){
        this.id = Id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(Integer Titel) {
        this.titel = titel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public Date getDate() {
        return date;
    }

    public void setId(Date Date) {
        this.date = Date;
    }

    public Set<UserDto> getUsers() {
        return users;
    }

    public void setUsers(Set<UserDto> Users) {
        this.users = Users;
    }

    public Set<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDto> Roles) {
        this.roles = Roles;
    }


}
