package com.example.demo.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
// This class (Interface) is responsible for Data Access
public interface CompanyRepository extends JpaRepository <Company, Long> {
    // Business logic to find the user by email
    @Query("SELECT s FROM Company s where s.compEmail =?1")
    Optional <Company> findCompanyByCompEmail(String compAdress);
}
