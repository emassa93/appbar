package com.bar.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bar.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
