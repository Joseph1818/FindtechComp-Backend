package com.example.demo;

import com.example.demo.company.Company;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping

	public List<Company> hello()
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
