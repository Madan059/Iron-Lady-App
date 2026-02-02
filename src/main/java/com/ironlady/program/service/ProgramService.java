package com.ironlady.program.service;

import com.ironlady.program.model.Program;

import java.util.List;

public interface ProgramService {

    Program createProgram(Program program);

    List<Program> getAllPrograms();

    Program getProgramById(Long id);

    Program updateProgram(Long id, Program program);

    void deleteProgram(Long id);
}
