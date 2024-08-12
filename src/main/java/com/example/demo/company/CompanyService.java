package com.example.demo.company;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CompanyService {

    private  final CompanyRepository companyRepository;
    @Autowired
    public CompanyService(CompanyRepository companyRepository) {

        this.companyRepository = companyRepository;
    }

    public List<Company> getCompanys()
    {
    return companyRepository.findAll();

    }
    public void addCompany(Company company) {
        // Exception to check if an Email of a specific company already exist and trow an error
        Optional<Company> companyCheckEmail = companyRepository.findCompanyByCompEmail(company.getCompEmail());
        if (companyCheckEmail.isPresent()) {
            throw new IllegalStateException("Company with this specif email already exist");
        }
        companyRepository.save(company);
        System.out.println(company);
    }

    public boolean deleteCompany(Long companyId) {
    // Exception to handle if company already exists into database
       boolean exists = companyRepository.existsById(companyId);
       if(!exists) {
           throw new IllegalStateException("Company with id " + companyId + " does not exists");
        }
       companyRepository.deleteById(companyId);
      return true;
    }

    public ApiResponse updateCompany(Long companyId, Company updatedCompany) {
        if (!companyRepository.existsById(companyId)) {
            throw new IllegalStateException("Company with id " + companyId + " does not exist");
        }
        updatedCompany.setId(companyId);
        companyRepository.save(updatedCompany);
        return new ApiResponse(true, "Company updated successfully");
    }
}