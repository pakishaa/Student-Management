package com.example.studentmanagement.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Exam {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "is_alive")
  private Boolean isAlive;
  private Date date;

  @ManyToOne
  @JoinColumn(name = "professor_id", referencedColumnName = "id")
  private Professor professor;

  @ManyToOne
  @JoinColumn(name = "course_id", nullable = false)
  private Course course;

  @Column(name = "time_start")
  private String timeStart;

  @Column(name = "time_end")
  private String timeEnd;
}
