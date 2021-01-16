package com.engine.allAboutUsersEngine.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.engine.allAboutUsersEngine.beans.User;

public interface UserRepository extends CrudRepository<User, String> {

	Optional<User> findByUserId(String userId);

}
