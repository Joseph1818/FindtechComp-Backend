package com.example.demo.company;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CompanyConfig {

    @Bean
    CommandLineRunner commandLineRunner(CompanyRepository repository) {
        return args -> {
            Company dvt = new Company(
                    "Dvt",
                    "dvt@info.co.za",
                    "0218298448",
                    "dvd.com",
                    "54 Century city boulevard"
            );
            Company sovTec = new Company(
                    "SovTec",
                    "SovTec@info.co.za",
                    "0218298448",
                    "Sovtec.com",
                    "54 Century city boulevard"
            );
            // Save companies into the database
            repository.saveAll(List.of(dvt, sovTec));
        };
    }
}
