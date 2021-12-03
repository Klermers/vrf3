package com.example.vrf3.Database;


import com.example.vrf3.Dto.ImageDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Getter
@Setter
@Entity
@Table( name = "user")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String username;
    @Column
    private String displayname;
    @Column
    private String password;
    @Column
    private Date joindate;
    @OneToOne
    @JoinColumn(name = "image_id")
    private ImagesData imagesData;

    @OneToMany(mappedBy = "userData")
    private Set<Event_Roles_UsersData> eventroles;

    public UserData() {

    }
}

