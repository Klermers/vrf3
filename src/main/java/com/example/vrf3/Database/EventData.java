package com.example.vrf3.Database;


import org.aspectj.weaver.World;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "event")
public class EventData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String titel;
    @Column
    private Date eventdate;
    @Column
    private String description;
    @ManyToOne
    @JoinColumn(name = "world_id")
    private WorldData worldData;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private CategoriesData categoriesData;
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ImagesData> imagesData;
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Event_Roles_UsersData>  usersrole;

    public EventData(){
    }


    public EventData(String Titel, Date Date,String description){
        this.titel = Titel;
        this.eventdate = Date;
        this.description =description;

    }
/*
    public void addUserwithRole(UserData user)
    {
        this.users.add(user);
        user.getEvents().add(this);
    }

    public void removeUser(UserData user)
    {
        this.users.remove(user);
        user.getEvents().remove(this);
    }

    public void addRole(RoleData role)
    {
        this.roles.add(role);
        role.getEvents().add(this);
    }

    public void removeRole(RoleData role)
    {
        this.roles.remove(role);
        role.getEvents().remove(this);
    }

 */

    public Integer getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEventdate() {
        return eventdate;
    }

    public void setEventdate(Date eventdate) {
        this.eventdate = eventdate;
    }

    public WorldData getWorldData() {
        return worldData;
    }

    public void setWorldData(WorldData worldData) {
        this.worldData = worldData;
    }

    public CategoriesData getCategoriesData() {
        return categoriesData;
    }

    public void setCategoriesData(CategoriesData categoriesData) {
        this.categoriesData = categoriesData;
    }

    public Set<Event_Roles_UsersData> getUsersrole() {
        return usersrole;
    }
}
