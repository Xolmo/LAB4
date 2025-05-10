package com.example.lab4.Entity;

import com.example.lab4.Embeddable.DoctorSpecialtyKey;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "doctor_specialty")
public class DoctorSpecialty {
    @EmbeddedId
    DoctorSpecialtyKey id;

    @ManyToOne
    @MapsId("doctorId")
    @JoinColumn(name = "doctor_id")
    private Doctores doctor;

    @ManyToOne
    @MapsId("specialtyId")
    @JoinColumn(name = "specialty_id")
    private Especialidad especialidad;
}
