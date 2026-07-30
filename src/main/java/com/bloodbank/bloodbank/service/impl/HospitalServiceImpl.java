package com.bloodbank.bloodbank.service.impl;

import com.bloodbank.bloodbank.entity.Hospital;
import com.bloodbank.bloodbank.reposetory.HospitalRepository;
import com.bloodbank.bloodbank.service.HospitalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    private final HospitalRepository hospitalRepository;

    public HospitalServiceImpl(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    @Override
    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    @Override
    public Hospital getHospitalById(Long id) {
        return hospitalRepository.findById(id).orElseThrow();
    }

    @Override
    public Hospital updateHospital(Long id, Hospital hospital) {
        Hospital existingHospital = getHospitalById(id);
        existingHospital.setName(hospital.getName());
        existingHospital.setAddress(hospital.getAddress());
        existingHospital.setContact(hospital.getContact());
        return hospitalRepository.save(existingHospital);
    }

    @Override
    public void deleteHospital(Long id) {
        hospitalRepository.deleteById(id);
    }
}