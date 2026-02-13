package com.sc.empmgmt.mto.dao.impl;

import com.sc.empmgmt.mto.dao.EmployeeDao;
import com.sc.empmgmt.mto.dao.entities.Employee;
import com.sc.empmgmt.mto.dao.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public Employee findById(long id) {
        return employeesRepository.findById(id).orElse(null);
        /*Optional<Employee> employee = employeesRepository.findById(id);
        if(Objects.nonNull(employee)) {
            return employee.get();
        } else {
            System.out.println("Employee with id " + id + " not found");
        }
        return null;*/
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeesRepository.findByName(name);
    }

    @Override
    public Employee create(Employee employee) {
        return employeesRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        Employee existingEmployee = findById(employee.getEmployeeId());
        if(Objects.nonNull(existingEmployee)) {
            existingEmployee.setEmployeeName(employee.getEmployeeName());
            existingEmployee.setEmployeeEmail(employee.getEmployeeEmail());
            existingEmployee.setDepartment(employee.getDepartment());
            return employeesRepository.save(existingEmployee);
        }
        return null;
    }

    @Override
    public void deleteById(long id) {
        Employee existingEmployee = findById(id);
        if(Objects.nonNull(existingEmployee)) {
            employeesRepository.deleteById(id);
        } else {
            System.out.println("Employee with id " + id + " not found");
        }
    }

    @Override
    public List<Employee> findAll() {
        return employeesRepository.findAll();
    }
}
