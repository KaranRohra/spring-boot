package com.codesnippet.tutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codesnippet.tutorial.dto.EmployeeDto;
import com.codesnippet.tutorial.repository.EmployeeRepository;

@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;

  public EmployeeDto getEmployeeById(Integer id) {
    var employeeEntity = employeeRepository.getEmployeeById(id);
    return new EmployeeDto(employeeEntity.getName(), employeeEntity.getEmail(), employeeEntity.getDepartment());
  }
}
