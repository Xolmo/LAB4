package com.example.lab4.Embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class ClinicDoctorKey implements Serializable {
    @Column(name = "clinic_id")
    int clinicId;

    @Column(name = "doctor_id")
    int doctorId;
}
