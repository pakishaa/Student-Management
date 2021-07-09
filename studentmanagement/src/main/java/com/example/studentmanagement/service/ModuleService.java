package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Module;
import com.example.studentmanagement.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {

  private final ModuleRepository moduleRepository;

  @Autowired
  public ModuleService(ModuleRepository moduleRepository) {
    this.moduleRepository = moduleRepository;
  }

  public Module addModule(Module module) {
    return moduleRepository.save(module);
  }
}
