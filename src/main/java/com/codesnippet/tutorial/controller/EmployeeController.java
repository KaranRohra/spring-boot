package com.codesnippet.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.codesnippet.tutorial.dto.EmployeeDto;
import com.codesnippet.tutorial.service.EmployeeService;

@RestController
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employees/{id}")
  public ResponseEntity<EmployeeDto> getMethodName(@PathVariable Integer id) {
    return ResponseEntity.ok(employeeService.getEmployeeById(id));
  }

}
