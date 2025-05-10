package com.example.lab4.Embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class DoctorSpecialtyKey implements Serializable {
    @Column(name = "doctor_id")
    int doctorId;

    @Column(name = "specialty_id")
    int specialtyId;
}
