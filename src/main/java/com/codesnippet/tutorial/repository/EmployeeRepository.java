package com.codesnippet.tutorial.repository;

import org.springframework.stereotype.Repository;

import com.codesnippet.tutorial.entity.EmployeeEntity;

@Repository
public class EmployeeRepository {
  public EmployeeEntity getEmployeeById(Integer id) {
    return new EmployeeEntity(
        1L, "Karan Rohra", "Karan@gmail.com", "IT");
  }
}
