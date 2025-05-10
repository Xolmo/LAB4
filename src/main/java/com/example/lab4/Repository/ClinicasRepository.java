package com.example.lab4.Repository;

import com.example.lab4.Entity.Clinicas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicasRepository extends JpaRepository<Clinicas, Integer> {
}
