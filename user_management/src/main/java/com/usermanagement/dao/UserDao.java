package com.usermanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usermanagement.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>, CustomRepository{

}
