package com.example.vrf3.Repositoy;

import com.example.vrf3.Database.CategoriesData;
import com.example.vrf3.Database.EventData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CategorieRepository extends CrudRepository<CategoriesData, Integer> {
    Set<CategoriesData> findAll();
}
