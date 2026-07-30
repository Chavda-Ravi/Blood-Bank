package com.bloodbank.bloodbank.service.impl;

import com.bloodbank.bloodbank.entity.DonationRecord;
import com.bloodbank.bloodbank.reposetory.DonationRecordRepository;
import com.bloodbank.bloodbank.service.DonationRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationRecordServiceImpl implements DonationRecordService {

    private final DonationRecordRepository donationRecordRepository;

    public DonationRecordServiceImpl(DonationRecordRepository donationRecordRepository) {
        this.donationRecordRepository = donationRecordRepository;
    }

    @Override
    public DonationRecord saveDonationRecord(DonationRecord donationRecord) {
        return donationRecordRepository.save(donationRecord);
    }

    @Override
    public List<DonationRecord> getAllDonationRecords() {
        return donationRecordRepository.findAll();
    }

    @Override
    public DonationRecord getDonationRecordById(Long id) {
        return donationRecordRepository.findById(id).orElseThrow();
    }

    @Override
    public List<DonationRecord> getDonationRecordsByHospital(Long hospitalId) {
        return donationRecordRepository.findByHospitalId(hospitalId);
    }

    @Override
    public List<DonationRecord> getDonationRecordsByDonor(Long donorId) {
        return donationRecordRepository.findByDonorId(donorId);
    }

    @Override
    public DonationRecord updateDonationRecord(Long id, DonationRecord donationRecord) {
        DonationRecord existingRecord = getDonationRecordById(id);
        existingRecord.setDonor(donationRecord.getDonor());
        existingRecord.setHospital(donationRecord.getHospital());
        existingRecord.setDonationDate(donationRecord.getDonationDate());
        return donationRecordRepository.save(existingRecord);
    }

    @Override
    public void deleteDonationRecord(Long id) {
        donationRecordRepository.deleteById(id);
    }
}