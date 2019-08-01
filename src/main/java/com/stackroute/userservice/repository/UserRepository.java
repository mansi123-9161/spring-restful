package com.stackroute.userservice.repository;

import com.stackroute.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//create classpath and create bean at runtime
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    //implementation will be provided to run time
}
