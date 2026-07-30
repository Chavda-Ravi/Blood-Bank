package com.bloodbank.bloodbank.service.impl;

import com.bloodbank.bloodbank.entity.Donor;
import com.bloodbank.bloodbank.reposetory.DonorRepository;
import com.bloodbank.bloodbank.service.DonorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorServiceImpl implements DonorService {

    private final DonorRepository donorRepository;

    public DonorServiceImpl(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    @Override
    public Donor saveDonor(Donor donor) {
        return donorRepository.save(donor);
    }

    @Override
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    @Override
    public Donor getDonorById(Long id) {
        return donorRepository.findById(id).orElseThrow();
    }

    @Override
    public Donor updateDonor(Long id, Donor donor) {
        Donor existingDonor = getDonorById(id);
        existingDonor.setName(donor.getName());
        existingDonor.setAge(donor.getAge());
        existingDonor.setGender(donor.getGender());
        existingDonor.setBloodGroup(donor.getBloodGroup());
        return donorRepository.save(existingDonor);
    }

    @Override
    public void deleteDonor(Long id) {
        donorRepository.deleteById(id);
    }
}