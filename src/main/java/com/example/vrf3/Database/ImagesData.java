package com.example.vrf3.Database;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
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
    @JsonManagedReference
    @ManyToOne
    private EventData event;
    @OneToOne(mappedBy = "imagesData")
    private UserData userData;

    public ImagesData(){

    }
}
