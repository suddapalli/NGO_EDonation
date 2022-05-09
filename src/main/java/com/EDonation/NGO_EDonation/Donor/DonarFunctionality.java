package com.EDonation.NGO_EDonation.Donor;

import javax.persistence.*;

@Entity
@Table
public class DonarFunctionality {
    @Id
    @SequenceGenerator(
            name="donor_sequence",
            sequenceName ="donor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "donor_sequence"

    )
    private int NGOID;
    private String DonarName;
    private String Username;
    private String Password;
    private String Email;
    private long PhoneNumber;
    private  String Address;

    public DonarFunctionality() {
    }

    public DonarFunctionality(String donarName, String username,
                              String password, String email,
                              long phoneNumber, String address)
    {
        DonarName = donarName;
        Username = username;
        Password = password;
        Email = email;
        PhoneNumber = phoneNumber;
        Address = address;
    }


    public DonarFunctionality(int ngoid, String donarName, String username,
                              String password, String email, long phoneNumber,
                              String address) {
        NGOID = ngoid;
        DonarName = donarName;
        Username = username;
        Password = password;
        Email = email;
        PhoneNumber = phoneNumber;
        Address = address;

    }

    public int getNGOID() {
        return NGOID;
    }

    public void setNGOID(int NGOID) {
        this.NGOID = NGOID;
    }

    public String getDonarName() {
        return DonarName;
    }

    public void setDonarName(String donarName) {
        DonarName = donarName;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
