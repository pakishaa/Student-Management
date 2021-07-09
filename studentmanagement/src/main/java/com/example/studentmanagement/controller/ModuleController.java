package com.example.studentmanagement.controller;

import com.example.studentmanagement.model.Module;
import com.example.studentmanagement.service.ModuleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module")
public class ModuleController {

  private final ModuleService moduleService;

  public ModuleController(ModuleService moduleService) {
    this.moduleService = moduleService;
  }

  @PostMapping("/add")
  public ResponseEntity<Module> addUModule (@RequestBody Module module) {
    Module newModule = moduleService.addModule(module);
    return new ResponseEntity<>(newModule, HttpStatus.CREATED);
  }
}
