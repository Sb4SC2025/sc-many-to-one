package com.sc.empmgmt.mto.dao.repositories;

import com.sc.empmgmt.mto.dao.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Long> {
}
