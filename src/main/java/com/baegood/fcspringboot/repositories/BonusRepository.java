package com.baegood.fcspringboot.repositories;

import com.baegood.fcspringboot.domains.Bonus;
import com.baegood.fcspringboot.domains.BonusId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BonusRepository extends JpaRepository<Bonus, BonusId> {
}
