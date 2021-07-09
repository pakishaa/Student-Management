package com.example.studentmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "professor_course")
@IdClass(ProfessorCoursePKId.class)
public class ProfessorCourse {

  @Id
  @ManyToOne
  @JoinColumn(name = "professor_id", nullable = false)
  private Professor professor;

  @Id
  @ManyToOne
  @JoinColumn(name = "course_id", nullable = false)
  private Course course;
}
