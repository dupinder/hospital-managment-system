package com.mm.dao.Doctor;

import com.mm.model.Doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
