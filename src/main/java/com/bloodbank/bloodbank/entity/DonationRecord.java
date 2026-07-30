package com.bloodbank.bloodbank.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

@Entity
@Table(name = "donation_records")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "donor_id")
    @JsonIgnoreProperties("donationRecords")
    private Donor donor;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    @JsonIgnoreProperties("donationRecords")
    private Hospital hospital;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate donationDate;

}