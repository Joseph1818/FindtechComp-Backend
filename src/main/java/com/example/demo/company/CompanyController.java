package com.example.demo.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/company")
public class CompanyController {

    private final CompanyService companyService;
    @Autowired
    public CompanyController (CompanyService companyService) {
        this.companyService = companyService;
    }
    @GetMapping

    //Service layer is responsible for business logic
    public List<Company> getCompanys()
    {
    return companyService.getCompanys();
    }
}
