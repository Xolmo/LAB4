package com.example.lab4.Repository;

import com.example.lab4.Entity.Doctores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctoresRepository extends JpaRepository<Doctores, Integer> {
}
