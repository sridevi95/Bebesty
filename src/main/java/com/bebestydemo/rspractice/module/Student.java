package com.bebestydemo.rspractice.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
  private int studnetId;
  private String name;
  private String location;
  private String email;
  private String gender;
  private String course;

}
