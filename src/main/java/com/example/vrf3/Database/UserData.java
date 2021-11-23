package com.example.vrf3.Database;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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

    @OneToMany
    private Set<Event_Roles_UsersData>  eventroles;

    public UserData(){

    }

    public UserData(String Username,String Password, String Displayname) {
        this.username = Username;
        this.password = Password;
        this.displayname = Displayname;
    }

    public UserData(String Username,String Password, String Displayname, Date Joindate) {
        this.username = Username;
        this.password = Password;
        this.displayname = Displayname;
        this.joindate = Joindate;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        id = Id;
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

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }
}

