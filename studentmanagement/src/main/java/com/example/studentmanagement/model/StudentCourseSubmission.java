package com.example.studentmanagement.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student_course_submission")
@IdClass(StudentCourseSubmissionPKId.class)
public class StudentCourseSubmission {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "student_course_submission")
  private Date studentCourseSubmission;

  @Id
  @ManyToOne
  @JoinColumn(name = "course_id", nullable = false)
  private Course course;

  @Id
  @ManyToOne
  @JoinColumn(name = "student_id", nullable = false)
  private Student student;

  @ManyToOne
  @JoinColumn(name = "professor_id")
  private Professor professor;

  @Column(name = "is_accepted")
  private Boolean isAccepted;
}
