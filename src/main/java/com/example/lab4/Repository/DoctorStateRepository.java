package com.example.lab4.Repository;

import com.example.lab4.Entity.DoctorState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorStateRepository extends JpaRepository<DoctorState, Integer> {
}
