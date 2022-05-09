package com.EDonation.NGO_EDonation.Donation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {
    private final DonationRepository donationRepository;
@Autowired
    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }
    public List<DonationDetails> getDonationdetails(){
    return donationRepository.findAll();
    }


}
