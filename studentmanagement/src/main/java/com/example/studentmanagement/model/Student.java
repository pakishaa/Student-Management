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
@Table(name = "student")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Integer id;
  private String index;

  @Column(name = "date_started")
  private Date dateStarted;

  @Column(name = "date_finished")
  private Date dateFinished;

  @Column(name = "final_grade")
  private Integer finalGrade;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "users_id", referencedColumnName = "id")
  private User users;

  @OneToMany(mappedBy = "student")
  private Set<StudentCourse> studentCourses;
}
