package com.bloodbank.bloodbank.reposetory;

import com.bloodbank.bloodbank.entity.DonationRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonationRecordRepository extends JpaRepository<DonationRecord, Long> {

    List<DonationRecord> findByHospitalId(Long hospitalId);

    List<DonationRecord> findByDonorId(Long donorId);
}