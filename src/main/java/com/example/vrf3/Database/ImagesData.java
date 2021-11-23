package com.example.vrf3.Database;

import javax.persistence.*;

@Entity
@Table( name = "images")
public class ImagesData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String image;
    @ManyToOne
    private EventData eventData;

    public ImagesData(){

    }
}
