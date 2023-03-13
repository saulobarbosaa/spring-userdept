package com.userdptapi.UserDept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userdptapi.UserDept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
