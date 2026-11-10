//this is to connect the Account class to the db to fascilitate data entry and retrieval
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    //spring will use this to perform most db commands on our behalf
}