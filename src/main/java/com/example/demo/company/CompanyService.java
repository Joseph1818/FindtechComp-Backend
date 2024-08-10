package com.example.demo.company;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CompanyService {

    public List<Company> getCompanys()
    {
        return List.of(
                new Company(
                        1L,
                        "Dvt",
                        "dvt@info.co.za",
                        "0218298448",
                        "dvd.com",
                        "54 Century city boulevard"
                )
        );

    }

}
