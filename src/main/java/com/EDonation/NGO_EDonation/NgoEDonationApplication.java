package com.EDonation.NGO_EDonation;

import com.EDonation.NGO_EDonation.Donor.DonarFunctionality;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SpringBootApplication
public class NgoEDonationApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(NgoEDonationApplication.class, args);
	}

}

