package com.bloodbank.bloodbank.controller;

import com.bloodbank.bloodbank.entity.DonationRecord;
import com.bloodbank.bloodbank.service.DonationRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//http://localhost:8080/
@RestController
@RequestMapping("/api/donation-records")
public class DonationRecordController {

    private final DonationRecordService donationRecordService;

    public DonationRecordController(DonationRecordService donationRecordService) {
        this.donationRecordService = donationRecordService;
    }

    @PostMapping
    public DonationRecord saveDonationRecord(@RequestBody DonationRecord donationRecord) {
        return donationRecordService.saveDonationRecord(donationRecord);
    }

    @GetMapping
    public List<DonationRecord> getAllDonationRecords() {
        return donationRecordService.getAllDonationRecords();
    }

    @GetMapping("/{id}")
    public DonationRecord getDonationRecordById(@PathVariable Long id) {
        return donationRecordService.getDonationRecordById(id);
    }

    @GetMapping("/hospital/{hospitalId}")
    public List<DonationRecord> getByHospital(@PathVariable Long hospitalId) {
        return donationRecordService.getDonationRecordsByHospital(hospitalId);
    }

    @GetMapping("/donor/{donorId}")
    public List<DonationRecord> getByDonor(@PathVariable Long donorId) {
        return donationRecordService.getDonationRecordsByDonor(donorId);
    }

    @PutMapping("/{id}")
    public DonationRecord updateDonationRecord(@PathVariable Long id, @RequestBody DonationRecord donationRecord) {
        return donationRecordService.updateDonationRecord(id, donationRecord);
    }

    @DeleteMapping("/{id}")
    public void deleteDonationRecord(@PathVariable Long id) {
        donationRecordService.deleteDonationRecord(id);
    }
}

//{
// "donor": { "id": 1 },
// "hospital": { "id": 1 },
// "donationDate":
// "2026-03-30"
// }