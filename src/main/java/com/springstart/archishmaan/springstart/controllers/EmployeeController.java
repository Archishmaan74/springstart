package com.springstart.archishmaan.springstart.controllers;


//Operations
//GET /employees
//POST /employees
//DELETE /employees/{id}

import com.springstart.archishmaan.springstart.dto.EmployeeDTO;
import com.springstart.archishmaan.springstart.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeesById(@PathVariable("id") Long empId){
        return employeeService.getEmployeeById(empId);
    }

    @GetMapping(path = "/age")
    public String getString(@RequestParam("sortBy") String sortBy, @RequestParam("age") Integer age){
        return "Hey! There "+sortBy + " of age " + age;
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO);
    }

    @PutMapping(path = "/{id}")
    public EmployeeDTO updateEmployeeById(@PathVariable Long id, @RequestBody EmployeeDTO updatedEmployeeDTO) {
        return employeeService.updateEmployeeById(id, updatedEmployeeDTO);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }

}
