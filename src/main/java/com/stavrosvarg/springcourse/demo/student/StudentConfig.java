package com.stavrosvarg.springcourse.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student stavros = new Student("Stavros", "email@gmail.com", LocalDate.of(2000, Month.JANUARY, 8));
            Student alex = new Student("Alex", "alex@gmail.com", LocalDate.of(2002, Month.JULY, 9));

            studentRepository.saveAll(List.of(stavros, alex));
        };
    }
}
