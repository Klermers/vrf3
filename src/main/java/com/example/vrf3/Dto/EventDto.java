package com.example.vrf3.Dto;

import java.util.Date;
import java.util.Set;

public class EventDto {

    private int id;

    private String titel;

    private Date date;

    private String description;

    private WorldDto worldDto;

    private CategorieDto categorieDto;

    private Set<ImageDto> imageDtos;

    private Set<Event_Roles_UsersDto> event_roles_usersDtos;

    public EventDto(){

    }
    public EventDto(int Id, String Titel, Date Date, String Description, WorldDto WorldDto, CategorieDto CategorieDto, Set<ImageDto> ImageDto, Set<Event_Roles_UsersDto> Event_Roles_UsersDto){
        this.id = Id;
        this.titel = Titel;
        this.description= Description;
        this.date = Date;
        this.worldDto = WorldDto;
        this.categorieDto = CategorieDto;
        this.imageDtos = ImageDto;
        this.event_roles_usersDtos = Event_Roles_UsersDto;
    }

    public EventDto(String Titel, String Description,Set<ImageDto> ImageDto){
        this.titel = Titel;
        this.description= Description;
        this.imageDtos = ImageDto;
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

    public WorldDto getWorldDto() {
        return worldDto;
    }

    public void setWorldDto(WorldDto worldDto) {
        this.worldDto = worldDto;
    }

    public CategorieDto getCategorieDto() {
        return categorieDto;
    }

    public void setCategorieDto(CategorieDto categorieDto) {
        this.categorieDto = categorieDto;
    }

    public Set<ImageDto> getImageDtos() {
        return imageDtos;
    }

    public void setImageDtos(Set<ImageDto> imageDtos) {
        this.imageDtos = imageDtos;
    }

    public Set<Event_Roles_UsersDto> getEvent_roles_usersDtos() {
        return event_roles_usersDtos;
    }

    public void setEvent_roles_usersDtos(Set<Event_Roles_UsersDto> event_roles_usersDtos) {
        this.event_roles_usersDtos = event_roles_usersDtos;
    }
}
