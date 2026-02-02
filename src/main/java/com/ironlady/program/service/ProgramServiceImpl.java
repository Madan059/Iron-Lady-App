package com.ironlady.program.service;

import com.ironlady.program.model.Program;
import com.ironlady.program.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramServiceImpl implements ProgramService {

    @Autowired
    private ProgramRepository programRepository;

    @Override
    public Program createProgram(Program program) {
        return programRepository.save(program);
    }

    @Override
    public List<Program> getAllPrograms() {
        return programRepository.findAllByOrderByCreatedAtDesc();
    }

    @Override
    public Program getProgramById(Long id) {
        return programRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Program not found with id " + id));
    }

    @Override
    public Program updateProgram(Long id, Program updatedProgram) {
        Program existing = getProgramById(id);

        existing.setTitle(updatedProgram.getTitle());
        existing.setDescription(updatedProgram.getDescription());
        existing.setDuration(updatedProgram.getDuration());
        existing.setMode(updatedProgram.getMode());
        existing.setPrice(updatedProgram.getPrice());

        return programRepository.save(existing);
    }

    @Override
    public void deleteProgram(Long id) {
        programRepository.deleteById(id);
    }
}

