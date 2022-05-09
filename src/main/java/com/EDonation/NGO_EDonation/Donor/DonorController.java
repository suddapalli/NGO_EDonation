package com.EDonation.NGO_EDonation.Donor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="localhost:8080/e-donation/app/v1/donors/register-donar")
public class DonorController
{
    private final DonarService donarService;
    @Autowired
    public DonorController(DonarService donarService) {
        this.donarService = donarService;
       // this.donarService = new DonarService();

    }

    @GetMapping
    public List<DonarFunctionality> getDonar()
    {
        return donarService.getDonar();

    }

}
