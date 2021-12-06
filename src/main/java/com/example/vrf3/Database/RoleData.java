package com.example.vrf3.Database;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@Entity
@Table( name = "role")
public class RoleData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String role;
    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy = "roledata")
    private Set<Event_Roles_UsersData>  eventusers;

    public RoleData(){

    }
}
