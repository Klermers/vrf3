package com.example.vrf3.Database;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.World;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Getter
@Setter
@Entity
@Table( name = "event")
public class EventData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String titel;
    @Column
    private Date date;
    @Column
    private String description;
    @ManyToOne
    @JoinColumn(name = "world_id")
    private WorldData worldData;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private CategoriesData categoriesData;
    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ImagesData> imagesData;
    @OneToMany(mappedBy = "eventData", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Event_Roles_UsersData>  usersrole;

    public EventData(){
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

}
