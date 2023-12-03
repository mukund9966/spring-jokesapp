package com.muku.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class SpringConfig {

    @Bean
    @Scope("singleton")
    public ChuckNorrisQuotes getChuckNorrisQuoteBean() {
        return new ChuckNorrisQuotes();
    }
}
