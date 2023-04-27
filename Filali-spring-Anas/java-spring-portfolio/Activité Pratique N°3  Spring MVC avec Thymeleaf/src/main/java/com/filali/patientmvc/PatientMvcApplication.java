package com.filali.patientmvc;

import com.filali.patientmvc.entities.Patient;
import com.filali.patientmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);

    }
        @Bean
        CommandLineRunner start(PatientRepository patientRepository){
            return args -> {
                patientRepository.save(new Patient(null,"Mohamed",new Date(),false,42));
                patientRepository.save(new Patient(null,"Imane",new Date(),true,98));
                patientRepository.save(new Patient(null,"Yassine",new Date(),true,342));
                patientRepository.save(new Patient(null,"Laila",new Date(),false,123));
            };
        }
    }
