package com.example.studentmanagement.model;

import java.sql.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "professor")
public class Professor {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String title;

  @Column(name = "date_started")
  private Date dateStarted;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "users_id", referencedColumnName = "id")
  private User users;

  @OneToMany(mappedBy = "professor")
  private Set<ProfessorCourse> professorCourses;

  @OneToMany(mappedBy = "professor")
  private Set<StudentCourseSubmission> studentCourseSubmissions;
}
