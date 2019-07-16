package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    private List<Employee> employees = new ArrayList<>();

    @PostMapping("/employees")
    public ResponseEntity createEmployee (@RequestBody Employee employee) {
        employee.setId(1);
        employees.add(employee);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/employees")
    public ResponseEntity getEmployees () {
        return ResponseEntity.ok(employees);
    }
}
