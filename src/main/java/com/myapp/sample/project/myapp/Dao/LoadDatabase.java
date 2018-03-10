package com.myapp.sample.project.myapp.Dao;

import com.myapp.sample.project.myapp.api.ChapterRepository;
import com.myapp.sample.project.myapp.model.Chapter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init(ChapterRepository repository) {
        return args -> {
            Flux.just(

                    new Chapter("Quick Start with Java"),
                    new Chapter("Reactive Web with Spring Boot"),
                    new Chapter("...and more!"))
                    .flatMap(repository::save)
                    .subscribe(System.out::println);
        };
    }
}
