package com.example.lab4.Repository;

import com.example.lab4.Entity.ClinicDoctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicDoctorRepository extends JpaRepository<ClinicDoctor, Integer> {
}
