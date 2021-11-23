package com.example.vrf3.Database;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table( name = "categorie")
public class CategoriesData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String categorie;
    @OneToMany(mappedBy = "event")
    private Set<EventData> eventData;

    public void CategorieData (){

    }

    public Integer getId() {
        return id;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Set<EventData> getEventData() {
        return eventData;
    }
}
