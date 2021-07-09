package com.example.studentmanagement.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "course")
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String name;
  private Integer semester;
  private Integer duration;

  @OneToMany(mappedBy="course")
  private Set<Schedule> schedules;

  @OneToMany(mappedBy="course")
  private Set<ModuleCourse> moduleCourses;

  @OneToMany(mappedBy="course")
  private Set<Exam> exams;

  @OneToMany(mappedBy="course")
  private Set<ProfessorCourse> professorCourses;

  @OneToMany(mappedBy="course")
  private Set<StudentCourse> studentCourses;

  @OneToMany(mappedBy="course")
  private Set<StudentCourseSubmission> studentCourseSubmissions;
}
