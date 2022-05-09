package com.EDonation.NGO_EDonation.NGO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path="localhost:8080//e-donation/api/v1/by-ngo-id")
public class NGOController {
    private final NGOService ngoService;

    public NGOController(NGOService ngoService) {
        this.ngoService = ngoService;
    }
@GetMapping
    public List<NGODetails> getNGODetails(){
        return ngoService.getNGODetails();
    }
}
