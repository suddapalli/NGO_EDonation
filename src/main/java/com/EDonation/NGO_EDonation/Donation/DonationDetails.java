package com.EDonation.NGO_EDonation.Donation;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class DonationDetails {
    @Id
    @SequenceGenerator(
            name="donation_sequence",
            sequenceName ="donation_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "donation_sequence"

    )
    private Integer DonarId;
    private Integer NGOID;
    private String DonationType;
    private float Amount;
    private Date DonationDate;

    public DonationDetails() {
    }

    public DonationDetails(Integer donarId, Integer NGOID, String donationType, float amount, Date donationDate) {
        DonarId = donarId;
        this.NGOID = NGOID;
        DonationType = donationType;
        Amount = amount;
        DonationDate = donationDate;
    }

    public DonationDetails(Integer NGOID, String donationType, float amount, Date donationDate) {
        this.NGOID = NGOID;
        DonationType = donationType;
        Amount = amount;
        DonationDate = donationDate;
    }

    public DonationDetails(int ngoid, String electronic, int amount, LocalDate of) {
    }

    public Integer getDonarId() {
        return DonarId;
    }

    public void setDonarId(Integer donarId) {
        DonarId = donarId;
    }

    public Integer getNGOID() {
        return NGOID;
    }

    public void setNGOID(Integer NGOID) {
        this.NGOID = NGOID;
    }

    public String getDonationType() {
        return DonationType;
    }

    public void setDonationType(String donationType) {
        DonationType = donationType;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    public Date getDonationDate() {
        return DonationDate;
    }

    public void setDonationDate(Date donationDate) {
        DonationDate = donationDate;
    }
}
