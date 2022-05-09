package com.EDonation.NGO_EDonation.Donor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DonarConfig {
    @Bean
    CommandLineRunner commandLineRunner(DonarRepository repository){
        return args -> {
           DonarFunctionality Vijay= new DonarFunctionality
                    (       1,
                            "vh",
                            "Vijay",
                            "Vj",
                            "VJ",
                            1233445,
                            "hyderabad" +
                                    ""
                    );
            DonarFunctionality Babu= new DonarFunctionality
                    (       1,
                            "Babu",
                            "Babu",
                            "Babu",
                            "Babu@gmail.com",
                            1233445,
                            "hyderabad" +
                                    ""
                    );


            repository.saveAll(List.of(Vijay,Babu));
        };
    }

}
