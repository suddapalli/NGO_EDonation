package com.EDonation.NGO_EDonation.Donor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonarRepository extends JpaRepository<DonarFunctionality,Integer>
        {


}
