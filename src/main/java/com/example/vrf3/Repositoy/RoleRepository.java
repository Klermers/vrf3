package com.example.vrf3.Repositoy;

import com.example.vrf3.Database.RoleData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RoleData, Integer> {
}
