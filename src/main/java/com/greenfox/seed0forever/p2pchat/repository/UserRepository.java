package com.greenfox.seed0forever.p2pchat.repository;

import com.greenfox.seed0forever.p2pchat.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  @Override
  List<User> findAll();

  User findFirstByUsernameIgnoreCase(String username);

  @Override
  User findOne(Long id);

  @Override
  User save(User user);
}
