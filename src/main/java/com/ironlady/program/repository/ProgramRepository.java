package com.ironlady.program.repository;

import com.ironlady.program.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {

    // Fetch latest programs first (used by chatbot)
    List<Program> findAllByOrderByCreatedAtDesc();
}
