package com.example.vrf3.Database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@Entity
@Table( name = "world")
public class WorldData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String world;
    @OneToMany(mappedBy = "worldData")
    private Set<EventData> eventData;

    public void Worddata(){

    }
}
