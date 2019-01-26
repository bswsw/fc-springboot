package com.baegood.fcspringboot.repositories;

import com.baegood.fcspringboot.domains.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e INNER JOIN fetch e.department")
    List<Employee> findAllFetched();

    @Query("SELECT e from Employee e LEFT JOIN e.boss INNER JOIN FETCH e.department WHERE e.empNo = :id")
    Employee getByIdQuery(@Param("id") Long id);
}
