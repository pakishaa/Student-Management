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
@Table(name = "taking_exam")
@IdClass(TakingExamPKId.class)
public class TakingExam {

  @Id
  @ManyToOne
  @JoinColumn(name = "exam_id")
  private Exam exam;

  @Id
  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student student;

  private String grade;
}
