package com.auth.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.auth.model.Employee;

import java.util.Optional;

@Controller
public class EmployeeController {

    private List<Employee> employees = new ArrayList<>();

    @GetMapping("/employee")
    @ResponseBody
    public Optional<Employee> getEmployee(@RequestParam(required = false) String email) {
        return Optional.of(new Employee("abcc@gmail.com", "asdasda"));
    }

    @PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void postMessage(@RequestBody Employee employee) {
        employees.add(employee);
    }

}
