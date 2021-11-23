package com.example.vrf3.Repositoy;

import com.example.vrf3.Database.EventData;
import com.example.vrf3.Database.WorldData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorldRepository extends CrudRepository<WorldData, Integer> {
}
