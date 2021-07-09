package com.example.studentmanagement.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Schedule implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer year;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer day;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer hour;

  @Id
  @ManyToOne
  @JoinColumn(name = "course_id", nullable = false)
  private Course course;

  @ManyToOne
  @JoinColumn(name = "professor_id")
  private Professor professor;
}
