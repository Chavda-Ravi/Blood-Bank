package com.bloodbank.bloodbank.service;

import com.bloodbank.bloodbank.entity.DonationRecord;

import java.util.List;

public interface DonationRecordService {

    DonationRecord saveDonationRecord(DonationRecord donationRecord);

    List<DonationRecord> getAllDonationRecords();

    DonationRecord getDonationRecordById(Long id);

    List<DonationRecord> getDonationRecordsByHospital(Long hospitalId);

    List<DonationRecord> getDonationRecordsByDonor(Long donorId);

    DonationRecord updateDonationRecord(Long id, DonationRecord donationRecord);

    void deleteDonationRecord(Long id);
}