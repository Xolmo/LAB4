package com.example.lab4.Entity;

import com.example.lab4.Embeddable.ClinicDoctorKey;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "clinic_doctor")
public class ClinicDoctor {
    @EmbeddedId
    ClinicDoctorKey id;

    @ManyToOne
    @MapsId("clinicId")
    @JoinColumn(name = "clinic_id")
    private Clinicas clinicas;
    @ManyToOne
    @MapsId("doctorId")
    @JoinColumn(name = "doctor_id")
    private Doctores doctores;
}
