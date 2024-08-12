package com.example.demo.company;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.nio.file.Path;
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
    @PostMapping
    public void addCompany(@RequestBody Company company) {
        companyService.addCompany(company);
    }
    @DeleteMapping(path = "{companyId}")
    public void deleteCompany(@PathVariable("companyId") Long companyId) {
        companyService.deleteCompany(companyId);
    }
    @PutMapping(path = "{companyId}")
    public ResponseEntity<ApiResponse> updateCompany(
            @PathVariable("companyId") Long companyId,
            @RequestBody Company updatedCompany) {
        try {
            ApiResponse response = companyService.updateCompany(companyId, updatedCompany);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (IllegalStateException e) {
            return new ResponseEntity<>(new ApiResponse(false, e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }
}
