package com.example.demo.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// This class (Interface) is responsible for Data Access
public interface CompanyRepository extends JpaRepository <Company, Long> {

}
