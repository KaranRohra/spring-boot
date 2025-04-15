package com.codesnippet.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class EmployeeEntity {
  @Id
  private Long id;
  private String name;
  private String email;
  private String department;
}
