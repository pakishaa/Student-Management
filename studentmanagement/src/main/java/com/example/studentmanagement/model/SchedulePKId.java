package com.example.studentmanagement.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SchedulePKId implements Serializable{
  private Integer year;
  private Integer day;
  private Integer hour;
  private Course course;
}
