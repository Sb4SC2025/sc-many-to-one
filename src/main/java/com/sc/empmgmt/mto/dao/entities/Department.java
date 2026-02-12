package com.sc.empmgmt.mto.dao.entities;

import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "departments")
public class Department {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "dept_id")
        private Long departmentId;
        @Column(name = "dept_name")
        private String departmentName;
}
