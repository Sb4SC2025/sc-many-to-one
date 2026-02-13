package com.sc.empmgmt.mto.dao.repositories;

import com.sc.empmgmt.mto.dao.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);
}
