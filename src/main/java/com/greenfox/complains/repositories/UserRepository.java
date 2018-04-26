package com.greenfox.complains.repositories;

import com.greenfox.complains.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,String>{
  List<User> findAll();
}
