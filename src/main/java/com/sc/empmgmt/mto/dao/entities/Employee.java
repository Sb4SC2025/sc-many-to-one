package com.sc.empmgmt.mto.dao.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "employees")
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "emp_id")
        private Long employeeId;
        @Column(name = "emp_name")
        private String employeeName;
        @Column(name = "emp_email")
        private String employeeEmail;
        @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinColumn(name = "emp_dept_id", referencedColumnName = "dept_id")
        private Department department;

}
