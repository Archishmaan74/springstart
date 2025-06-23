package com.springstart.archishmaan.springstart.controllers;


//Operations
//GET /employees
//POST /employees
//DELETE /employees/{id}

import com.springstart.archishmaan.springstart.dto.EmployeeDTO;
import com.springstart.archishmaan.springstart.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getEmployeesById(@PathVariable("id") Long empId){
        return employeeService.getEmployeeById(empId);
    }

    @GetMapping(path = "/employees")
    public String getString(@RequestParam("sortBy") String sortBy, @RequestParam("age") Integer age){
        return "Hey! There "+sortBy + " of age " + age;
    }

    @PostMapping(path = "/employees")
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO);
    }
}
