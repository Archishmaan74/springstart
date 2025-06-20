package com.springstart.archishmaan.springstart.configuration;

import com.springstart.archishmaan.springstart.DB;
import com.springstart.archishmaan.springstart.ProdDB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DB getProdDBBean(){
        return new ProdDB();
    }
}
