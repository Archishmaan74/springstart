package com.springstart.archishmaan.springstart.controllers;


//Operations
//GET /employees
//POST /employees
//DELETE /employees/{id}

import com.springstart.archishmaan.springstart.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {
    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getEmployees(@PathVariable("id") Long empId){
        return new EmployeeDTO(
                empId,
                "Archishmaan",
                LocalDate.of(2025, 6, 21),
                true
        );
    }
}
