package com.codesnippet.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codesnippet.tutorial.dto.EmployeeDto;
import com.codesnippet.tutorial.service.EmployeeService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

// @Controller
@RestController // Combination of @Controller and @ResponseBody
public class AnnotationController {
    @Autowired
    EmployeeService employeeService;

    // @RequestMapping(path = "/getEmployee", method = RequestMethod.GET)
    // @ResponseBody
    @GetMapping("/getEmployee")
    public String getEmployeeString() {
        return "Employee";
    }

    @GetMapping("/getEmployeeById")
    public EmployeeDto getEmployeeById(@RequestParam Integer employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Integer employeeId) {
        return "Employee added with ID: " + employeeId;
    }

    @PutMapping("/updateEmployee/{employeeId}")
    public String updateEmployee(@PathVariable Integer employeeId) {
        return "Employee updated with ID: " + employeeId;
    }

    @DeleteMapping("/deleteEmployee")
    public String deleteEmployee() {
        return "Employee delete";
    }
}
