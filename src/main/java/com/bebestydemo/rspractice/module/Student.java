package com.bebestydemo.rspractice.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int studentId;
  private String name;
  private String location;

@Column(unique = true)
  private String email;
  private String gender;
  private String course;

}
