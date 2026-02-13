package com.sc.empmgmt.mto;

import com.sc.empmgmt.mto.dao.entities.Employee;
import com.sc.empmgmt.mto.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @PostMapping
    public Employee createEmployee(Employee employee) {
        return employeeService.create(employee);
    }

    @PutMapping
    public Employee updateEmployee(Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable long id) {
        return employeeService.findById(id);
    }

    @GetMapping("/search/{byname}")
    public List<Employee> getEmployeesByName(@RequestParam(name = "byname") String name) {
        return employeeService.findByName(name);
    }

}
