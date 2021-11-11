package com.example.vrf3.Repositoy;

import com.example.vrf3.Database.UserData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserData, Integer> {
    UserData findByUsername(String username);

    @Override
    void deleteById(Integer id);
}
