package com.santos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santos.model.User;

public interface IUserRepo extends JpaRepository<User, Integer>{

}
