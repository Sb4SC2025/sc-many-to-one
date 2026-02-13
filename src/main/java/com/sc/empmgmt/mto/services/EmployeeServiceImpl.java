package com.sc.empmgmt.mto.services;

import com.sc.empmgmt.mto.dao.EmployeeDao;
import com.sc.empmgmt.mto.dao.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee findById(long id) {
        return employeeDao.findById(id);
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeDao.findByName(name);
    }

    @Override
    public Employee create(Employee employee) {
        // business logic can be added here before creating the employee
        return employeeDao.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        // business logic can be added here before updating the employee
        return employeeDao.update(employee);
    }

    @Override
    public void deleteById(long id) {
        employeeDao.deleteById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}
