package com.engine.allAboutUsersEngine.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engine.allAboutUsersEngine.beans.User;
import com.engine.allAboutUsersEngine.repositories.UserRepository;

@Service
public class ProcessService {

	@Autowired
	private UserRepository userRepository;

	public Optional<User> processUserById(String uuid) {
		Optional<User> fetchedSavedUser = userRepository.findByUserId(uuid);
		System.out.println("fetchedSavedUser in consumer >> " + fetchedSavedUser);
		
		return fetchedSavedUser;
	}

}
