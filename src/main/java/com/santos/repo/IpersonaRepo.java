package com.santos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santos.model.Persona;

public interface IpersonaRepo extends JpaRepository<Persona, Integer>{

}
