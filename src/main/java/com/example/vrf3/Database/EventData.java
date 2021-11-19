package com.example.vrf3.Database;


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
    @Column
    private String world;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "event_roles",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<RoleData> roles;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "event_users",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns =  @JoinColumn(name = "user_id"))
    private Set<UserData> users;


    public EventData(){

    }


    public EventData(String Titel, Date Date,String description){
        this.titel = Titel;
        this.eventdate = Date;
        this.description =description;

    }

    public void addUser(UserData user)
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

    public Integer getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Set<RoleData> getRoles() {
        return roles;
    }

    public Set<UserData> getUsers() {
        return users;
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
}
