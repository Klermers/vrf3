package com.example.vrf3.Repositoy;

import com.example.vrf3.Database.RoleData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface RoleRepository extends CrudRepository<RoleData, Integer> {

    Set<RoleData> findAll();
}
