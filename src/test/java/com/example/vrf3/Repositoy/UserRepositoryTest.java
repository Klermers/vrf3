package com.example.vrf3.Repositoy;

import com.example.vrf3.Database.UserData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByUsername_Userdata_ReturnTrue() {
        //given
        UserData userData = new UserData("klerm","passowrd","klerm");
        entityManager.persist(userData);
        entityManager.flush();

        //when
        UserData found = userRepository.findByUsername(userData.getUsername());

        //then
        assertEquals(userData.getUsername(),found.getUsername());
    }

    @Test
    public void findByUsername_Userdata_ReturnFalse() {
        //given
        UserData userData = new UserData("klerm","passowrd","klerm");
        entityManager.persist(userData);
        entityManager.flush();

        //when
        UserData found = userRepository.findByUsername(userData.getUsername());

        //then
        assertNotEquals(userData.getUsername(),"check");
    }

    @Test
    public void deleteById_Id_ReturnTrue() {
        //given
        UserData userData = new UserData("klerm","passowrd","klerm");
        entityManager.persist(userData);
        entityManager.flush();
        userRepository.deleteById(1);

        //when
        UserData found = userRepository.findById(1);

        //then
        assertNull(found);
    }
}