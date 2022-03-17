package com.coderscampus.week18.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.week18.domain.User;
import com.coderscampus.week18.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;

	public List<User> findAll() {
		return userRepo.findAll();
	}
	public User findById(Long userId) {
		Optional<User> findById = userRepo.findById(userId);
		return findById.orElse(new User()); // if nothing found send an empty user to avoid NPE
	}
}
