package com.bloodbank.bloodbank.service;

import com.bloodbank.bloodbank.entity.Donor;

import java.util.List;

public interface DonorService {

    Donor saveDonor(Donor donor);

    List<Donor> getAllDonors();

    Donor getDonorById(Long id);

    Donor updateDonor(Long id, Donor donor);

    void deleteDonor(Long id);
}