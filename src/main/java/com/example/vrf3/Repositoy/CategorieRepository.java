package com.example.vrf3.Repositoy;

import com.example.vrf3.Database.CategoriesData;
import com.example.vrf3.Database.EventData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends CrudRepository<CategoriesData, Integer> {
}
