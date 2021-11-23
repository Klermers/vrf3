package com.example.vrf3.Database;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table( name = "world")
public class WorldData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String world;
    @OneToMany(mappedBy = "event")
    private Set<EventData> eventData;

    public void Worddata(){

    }
}
