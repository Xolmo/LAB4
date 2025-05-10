package com.example.lab4.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "clinic")
public class Clinicas {
    @Id
    private int id;
    private String name;
    private String address;
    @Column(name = "phone_number")
    private int phoneNumber;
}
