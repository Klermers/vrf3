package com.example.vrf3.Database;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table( name = "event_roles_userdata")
public class Event_Roles_UsersData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventData eventData;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleData roledata;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserData userData;

    public void Event_Roles_UsersData() {

    }
}
