package com.EDonation.NGO_EDonation.NGO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NGORepository extends JpaRepository<NGODetails , String>{

}
