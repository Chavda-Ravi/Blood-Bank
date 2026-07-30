package com.bloodbank.bloodbank.reposetory;

import com.bloodbank.bloodbank.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}