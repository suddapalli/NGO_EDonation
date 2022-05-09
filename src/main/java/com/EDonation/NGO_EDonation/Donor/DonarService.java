package com.EDonation.NGO_EDonation.Donor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class DonarService {
private final DonarRepository donarRepository;
@Autowired
    public DonarService(DonarRepository donarRepository) {
        this.donarRepository = donarRepository;
    }

    public List<DonarFunctionality> getDonar() {
       return donarRepository.findAll();


    }
}
