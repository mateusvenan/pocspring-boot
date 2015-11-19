package br.com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Descrição da classe
 *
 * @author <a href="mailto:jbraz@ciandt.com">Jean Braz da Costa</a>
 */
@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class PocApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocApplication.class);
    }
}
