package com.example.demo.controller;
import com.example.demo.model.Clazz;
import com.example.demo.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clazz")
public class ClazzController {
    @Autowired
    private ClazzService clazzService;

    @PostMapping("/add")
    public void addClazz(@RequestBody Clazz clazz){
        clazzService.addClazz(clazz);
    }

    @PutMapping("/update")
    public void updateClazz (@RequestParam("clazzName") String clazzName , @RequestBody Clazz clazz){
        clazzService.updateClass(clazzName,clazz);
    }

    @DeleteMapping("/delete")
    public boolean deleteClazz(@PathVariable Clazz name ){
        return  clazzService.deleteClazz(name);
    }


    @GetMapping("/list")
    public List<Clazz> getAllClazz(){
        return clazzService.getAllClazz();
    }
}
