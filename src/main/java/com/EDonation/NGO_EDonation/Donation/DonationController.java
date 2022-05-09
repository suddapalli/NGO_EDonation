package com.EDonation.NGO_EDonation.Donation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="localhost:8080//e-donation/app/v1/donations/register-donation")
public class DonationController {
    private final DonationService donationService;
@Autowired
    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }
    @GetMapping
    public List<DonationDetails> getDonationdetails(){
    return donationService.getDonationdetails();
    }
}
