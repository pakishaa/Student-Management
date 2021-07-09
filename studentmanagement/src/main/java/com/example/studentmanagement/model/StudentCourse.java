package com.example.studentmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student_course")
@IdClass(StudentCoursePKId.class)
public class StudentCourse {

  @Id
  @ManyToOne
  @JoinColumn(name = "student_id", nullable = false)
  private Student student;

  @Id
  @ManyToOne
  @JoinColumn(name = "course_id", nullable = false)
  private Course course;
}
