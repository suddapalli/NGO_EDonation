package com.EDonation.NGO_EDonation.NGO;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table
public class NGODetails {
    @Id
    @SequenceGenerator(
            name="ngo_sequence",
            sequenceName ="ngo_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "ngo_sequence"

    )
    private  String NGOName;
    private String NGOUsername;
    private String NGOAddress;
    private Long NGOPhone;
    private Date EDate;

    public NGODetails(String NGOName, String NGOUsername, String NGOAddress, Long NGOPhone, Date EDate) {
        this.NGOName = NGOName;
        this.NGOUsername = NGOUsername;
        this.NGOAddress = NGOAddress;
        this.NGOPhone = NGOPhone;
        this.EDate = EDate;
    }

    public NGODetails() {
    }

    public String getNGOName() {
        return NGOName;
    }

    public void setNGOName(String NGOName) {
        this.NGOName = NGOName;
    }

    public String getNGOUsername() {
        return NGOUsername;
    }

    public void setNGOUsername(String NGOUsername) {
        this.NGOUsername = NGOUsername;
    }

    public String getNGOAddress() {
        return NGOAddress;
    }

    public void setNGOAddress(String NGOAddress) {
        this.NGOAddress = NGOAddress;
    }

    public Long getNGOPhone() {
        return NGOPhone;
    }

    public void setNGOPhone(Long NGOPhone) {
        this.NGOPhone = NGOPhone;
    }

    public Date getEDate() {
        return EDate;
    }

    public void setEDate(Date EDate) {
        this.EDate = EDate;
    }
}
