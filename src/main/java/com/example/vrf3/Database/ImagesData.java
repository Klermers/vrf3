package com.example.vrf3.Database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table( name = "image")
public class ImagesData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String image;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventData event;
    @OneToOne(mappedBy = "imagesData")
    private UserData userData;

    public ImagesData(){

    }
}
