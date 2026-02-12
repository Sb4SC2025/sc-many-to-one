package com.sc.empmgmt.mto.dao;

import com.sc.empmgmt.mto.dao.entities.Employee;

import java.util.List;

public interface EmployeeDao {
    public Employee findById(long id);
    public List<Employee> findByName(String name);
    public Employee create(Employee employee);
    public Employee update(Employee employee);
    public void deleteById(long id);
    public List<Employee> findAll();
}
