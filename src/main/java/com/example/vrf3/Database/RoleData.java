package com.example.vrf3.Database;


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

    @OneToMany(mappedBy = "roledata")
    private Set<Event_Roles_UsersData>  eventusers;

    public RoleData(){

    }
}
