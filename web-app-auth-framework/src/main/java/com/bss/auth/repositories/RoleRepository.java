package com.bss.auth.repositories;

import com.bss.auth.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Akshay Misra on 14-11-2018.
 */
@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByName(String name);
}

