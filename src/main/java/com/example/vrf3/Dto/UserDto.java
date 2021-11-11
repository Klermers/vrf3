package com.example.vrf3.Dto;

import java.util.Set;

public class UserDto {
    private Integer id;

    private String username;

    private String password;

    private String displayname;

    private Set<EventDto> events;

    public UserDto(){

    }

    public UserDto(String Username, String Password,Set<EventDto> Events ,String Displayname) {
        this.username = Username;
        this.password = Password;
        this.events = Events;
        this.displayname = Displayname;
    }

    public UserDto(int Id,Set<EventDto> Events ,String Displayname) {
        this.id = Id;
        this.events = Events;
        this.displayname = Displayname;
    }

    public UserDto(int Id,String Displayname) {
        this.id = Id;
        this.displayname = Displayname;
    }

    public UserDto(String Username,String Password,String Displayname) {
        this.username = Username;
        this.password = Password;
        this.displayname = Displayname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        Id = Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<EventDto> getEvents() {
        return events;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
}
