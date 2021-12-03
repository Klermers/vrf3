package com.example.vrf3.Repositoy;

import com.example.vrf3.Database.EventData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface EventRepository extends CrudRepository<EventData, Integer> {
    EventData findById(int id);
    Set<EventData> findAll();
}
