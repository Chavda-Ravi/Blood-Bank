package com.bloodbank.bloodbank.reposetory;

import com.bloodbank.bloodbank.entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}