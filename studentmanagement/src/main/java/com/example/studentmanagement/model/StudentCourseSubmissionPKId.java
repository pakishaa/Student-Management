package com.example.studentmanagement.model;

import java.io.Serializable;
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class StudentCourseSubmissionPKId implements Serializable {

  private StudentCourseSubmission studentCourseSubmission;
  private Course course;
  private Student student;
}
