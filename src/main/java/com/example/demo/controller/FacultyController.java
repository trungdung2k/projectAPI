package com.example.demo.controller;

import com.example.demo.model.Faculty;
import com.example.demo.model.Teacher;
import com.example.demo.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;
//    public FacultyController(FacultyService facultyService) {
//        this.facultyService = (FacultyService) facultyService;
//    }


    @PostMapping("/add")
    public void addFaculty(@RequestBody Faculty faculty){
        facultyService.addFaculty(faculty);
    }

    @PutMapping("/update")
    public void updateFaculty (@RequestParam("name") String name , @RequestBody Faculty faculty){
        facultyService.updateFaculty(name , faculty);
    }

    @DeleteMapping("/delete")
    public boolean deleteFaculty(@PathVariable Faculty name ){
        return  facultyService.deleteFaculty(name);
    }


    @GetMapping("/list")
    public List<Faculty> getAllFaculty(){
        return facultyService.getAllFaculty();
    }
}
