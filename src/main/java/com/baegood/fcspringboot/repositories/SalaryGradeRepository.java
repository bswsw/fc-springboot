package com.baegood.fcspringboot.repositories;

import com.baegood.fcspringboot.domains.SalaryGrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryGradeRepository extends JpaRepository<SalaryGrade, Long> {
}
