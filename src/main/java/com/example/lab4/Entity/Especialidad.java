package com.example.lab4.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name = "speciality")
public class Especialidad {
    @Id
    private int id;
    private String name;
    private int code;
}
