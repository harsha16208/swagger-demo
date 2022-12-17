package com.harsha.swaggerdemo.repo;

import org.springframework.data.repository.CrudRepository;

import com.harsha.swaggerdemo.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
