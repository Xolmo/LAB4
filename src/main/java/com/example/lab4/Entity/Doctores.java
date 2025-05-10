package com.example.lab4.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "doctor")
public class Doctores {
    @Id
    private int id;
    @Column(name = "full_name")
    private String fullName;
    private int dni;
    @Column(name = "phone_number")
    private int phoneNumber;
    private String email;
    @Column(name = "incorporation_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date incorporationDate;
    @Column(name = "state_id")
    private int stateId;
}
