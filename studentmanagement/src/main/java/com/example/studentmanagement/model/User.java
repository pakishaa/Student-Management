package com.example.studentmanagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Integer id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  private String username;
  private String password;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Email
  private String email;
  private String address;

  @Column(name = "date_created")
  private Date dateCreated;

  @Column(name = "is_admin")
  private Boolean isAdmin;

  @Column(name = "is_professor")
  private Boolean isProfessor;

  @Column(name = "is_deactivated")
  private Boolean isDeactivated;

  @OneToOne(mappedBy = "users")
  private Student student;

  @OneToOne(mappedBy = "users")
  private Professor professor;
}
