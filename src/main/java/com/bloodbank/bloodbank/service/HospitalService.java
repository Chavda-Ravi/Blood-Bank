package com.bloodbank.bloodbank.service;

import com.bloodbank.bloodbank.entity.Hospital;

import java.util.List;

public interface HospitalService {

    Hospital saveHospital(Hospital hospital);

    List<Hospital> getAllHospitals();

    Hospital getHospitalById(Long id);

    Hospital updateHospital(Long id, Hospital hospital);

    void deleteHospital(Long id);
}