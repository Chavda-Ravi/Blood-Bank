package com.bloodbank.bloodbank.controller;

import com.bloodbank.bloodbank.entity.Donor;
import com.bloodbank.bloodbank.service.DonorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")
public class DonorController {

    private final DonorService donorService;

    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }

    @PostMapping
    public Donor saveDonor(@RequestBody Donor donor) {
        return donorService.saveDonor(donor);
    }

    @GetMapping
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }

    @GetMapping("/{id}")
    public Donor getDonorById(@PathVariable Long id) {
        return donorService.getDonorById(id);
    }

    @PutMapping("/{id}")
    public Donor updateDonor(@PathVariable Long id, @RequestBody Donor donor) {
        return donorService.updateDonor(id, donor);
    }

    @DeleteMapping("/{id}")
    public void deleteDonor(@PathVariable Long id) {
        donorService.deleteDonor(id);
    }
}

//{
// "name": "Rahul Patel",
// "age": 25,
// "gender": "Male",
// "bloodGroup": "B+"
// }