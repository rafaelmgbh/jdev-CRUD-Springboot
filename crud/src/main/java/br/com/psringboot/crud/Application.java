package br.com.psringboot.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * Spring Boot application starter class
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @RequestMapping(value = "/olamundo/{nome}", method = RequestMethod.GET )
    @ResponseStatus(HttpStatus.OK)
    public String metodoRetornaOlamundo(@PathVariable String nome) {
    	return "Ola mundao " + nome;
     	
    }
}
