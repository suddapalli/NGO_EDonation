package com.EDonation.NGO_EDonation.NGO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NGOService {

    private  final NGORepository ngoRepository;
@Autowired
    public NGOService(NGORepository ngoRepository) {
        this.ngoRepository = ngoRepository;
    }
    public List<NGODetails> getNGODetails(){
         return ngoRepository.findAll();
    }
}
