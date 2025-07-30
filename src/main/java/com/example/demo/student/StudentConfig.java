package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student sama = new Student("Sama", "sama@gmail.com", LocalDate.of(1997, Month.APRIL,20));
            Student sara = new Student("Sara", "sara@gmail.com", LocalDate.of(1995, Month.MAY,22));

            repository.saveAll(List.of(sama, sara));
        };
    }
}
