package com.example.demo.company;

import jakarta.persistence.*;

@Entity
@Table(name = "company")


public class Company {
    @Id
    @SequenceGenerator(
            name = "company_sequence",
            sequenceName = "company_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "company_sequence"
    )

    private Long id;
    private String compName;
    private String compEmail;
    private String compNumber;
    private String comWebsiteUrl;
    private String compAdress;


    public Company() {

    }
    public Company(Long id, String compName, String compEmail, String compNumber, String comWebsiteUrl, String compAdress) {
        this.id = id;
        this.compName = compName;
        this.compEmail = compEmail;
        this.compNumber = compNumber;
        this.comWebsiteUrl = comWebsiteUrl;
        this.compAdress = compAdress;
    }

    public Company(String compName, String compEmail, String compNumber, String comWebsiteUrl, String compAdress) {
        this.compName = compName;
        this.compEmail = compEmail;
        this.compNumber = compNumber;
        this.comWebsiteUrl = comWebsiteUrl;
        this.compAdress = compAdress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompEmail() {
        return compEmail;
    }

    public void setCompEmail(String compEmail) {
        this.compEmail = compEmail;
    }

    public String getCompNumber() {
        return compNumber;
    }

    public void setCompNumber(String compNumber) {
        this.compNumber = compNumber;
    }

    public String getComWebsiteUrl() {
        return comWebsiteUrl;
    }

    public void setComWebsiteUrl(String comWebsiteUrl) {
        this.comWebsiteUrl = comWebsiteUrl;
    }

    public String getCompAdress() {
        return compAdress;
    }

    public void setCompAdress(String compAdress) {
        this.compAdress = compAdress;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", compName='" + compName + '\'' +
                ", compEmail='" + compEmail + '\'' +
                ", compNumber=" + compNumber +
                ", comWebsiteUrl='" + comWebsiteUrl + '\'' +
                ", compAdress='" + compAdress + '\'' +
                '}';
    }
}
