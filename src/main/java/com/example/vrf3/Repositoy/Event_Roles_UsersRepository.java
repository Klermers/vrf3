package com.example.vrf3.Repositoy;

import com.example.vrf3.Database.EventData;
import com.example.vrf3.Database.Event_Roles_UsersData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Event_Roles_UsersRepository extends CrudRepository<Event_Roles_UsersData, Integer> {
}
