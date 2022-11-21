package com.project.Green.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Green.model.Razor;

@Repository
public interface RazorRepository extends JpaRepository<Razor, Integer>{

}
