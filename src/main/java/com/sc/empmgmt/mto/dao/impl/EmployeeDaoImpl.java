package com.sc.empmgmt.mto.dao.impl;

import ch.qos.logback.core.CoreConstants;
import com.sc.empmgmt.mto.dao.EmployeeDao;
import com.sc.empmgmt.mto.dao.entities.Employee;
import com.sc.empmgmt.mto.dao.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public Employee findById(long id) {
        return null;
    }

    @Override
    public List<Employee> findByName(String name) {
        return null;
    }

    @Override
    public Employee create(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void deleteById(long id) {
        System.out.println("bvghhu");

    }

    @Override
    public List<Employee> findAll() {
        return null;
    }
}
