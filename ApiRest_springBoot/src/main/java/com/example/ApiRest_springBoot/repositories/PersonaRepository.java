package com.example.ApiRest_springBoot.repositories;

import com.example.ApiRest_springBoot.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
