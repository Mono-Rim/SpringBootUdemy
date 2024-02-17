package br.edu.ifsul.cstsi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Development
public class Config {

  //  @Bean(name = "applicationName")
   // public String apllicationName(){
   //     return "Sistema de Vendas";
   // }

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Rodando a config de desenvolvimento");
        };
    }

}
