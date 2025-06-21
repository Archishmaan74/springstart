package com.springstart.archishmaan.springstart.controllers;


//Operations
//GET /employees
//POST /employees
//DELETE /employees/{id}

import com.springstart.archishmaan.springstart.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {
    @GetMapping(path = "/employees")
    public EmployeeDTO getEmployees(){
        return new EmployeeDTO(
                72L,
                "Archishmaan",
                LocalDate.of(2025, 6, 21),
                true
        );
    }
}
