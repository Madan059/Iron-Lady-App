package com.ironlady.program.controller;

import com.ironlady.program.model.Program;
import com.ironlady.program.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programs")
@CrossOrigin(origins = "*")
public class ProgramController {

    @Autowired
    private ProgramService programService;

    // ✅ Create Program (ADMIN)
    @PostMapping
    public Program createProgram(@RequestBody Program program) {
        return programService.createProgram(program);
    }

    // ✅ Get All Programs (ADMIN + CHATBOT)
    @GetMapping
    public List<Program> getAllPrograms() {
        return programService.getAllPrograms();
    }

    // ✅ Get Program by ID
    @GetMapping("/{id}")
    public Program getProgramById(@PathVariable Long id) {
        return programService.getProgramById(id);
    }

    // ✅ Update Program
    @PutMapping("/{id}")
    public Program updateProgram(@PathVariable Long id,
                                 @RequestBody Program program) {
        return programService.updateProgram(id, program);
    }

    // ✅ Delete Program
    @DeleteMapping("/{id}")
    public void deleteProgram(@PathVariable Long id) {
        programService.deleteProgram(id);
    }
}
