package com.example.vrf3.Database;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table( name = "role")
public class RoleData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String role;

    @ManyToMany(mappedBy = "roles")
    private Set<EventData> events;

    public RoleData(){

    }

    public RoleData(String Role){
        this.role = role;

    }

    public Integer getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<EventData> getEvents() {
        return events;
    }
}
