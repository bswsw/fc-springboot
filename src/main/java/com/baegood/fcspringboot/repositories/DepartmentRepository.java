package com.baegood.fcspringboot.repositories;

import com.baegood.fcspringboot.domains.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
