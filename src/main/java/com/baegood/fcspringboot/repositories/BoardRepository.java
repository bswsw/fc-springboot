package com.baegood.fcspringboot.repositories;

import com.baegood.fcspringboot.domains.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
