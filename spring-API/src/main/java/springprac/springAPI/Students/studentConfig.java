package springprac.springAPI.Students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class studentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo repo){

        return  args -> {
           Students tobi= new Students(
            "tobi","t@gmail.com", LocalDate.of(2000, Month.JANUARY,5));

            Students tom= new Students(
                    "tom","to@gmail.com", LocalDate.of(2005, Month.JANUARY,5));


            Students ray= new Students(
                    "ray","r@gmail.com", LocalDate.of(2006, Month.JANUARY,5));


            Students jack= new Students(
                    "jack","t@gmail.com", LocalDate.of(2004, Month.JANUARY,5));


            Students tim= new Students(
                    "tim","tim@gmail.com", LocalDate.of(2001, Month.JANUARY,5));

            repo.saveAll(List.of(tobi,ray));
        };


    }
    }

