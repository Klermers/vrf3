package com.example.vrf3.Database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table( name = "categorie")
public class CategoriesData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String categorie;
    @OneToMany(mappedBy = "categoriesData")
    private Set<EventData> eventData;

    public void CategorieData (){

    }
}
