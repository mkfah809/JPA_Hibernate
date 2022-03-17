package com.coderscampus.week18.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.week18.domain.User;
@Repository // Spring will automatically know it's repo because of JpaRepository
public interface UserRepository extends JpaRepository<User, Long> {

}
