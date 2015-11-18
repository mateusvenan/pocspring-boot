package br.com.poc;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Descrição da classe
 *
 * @author <a href="mailto:jbraz@ciandt.com">Jean Braz da Costa</a>
 */
@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class PocApplication {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306");
        dataSource.setUsername("root");
        dataSource.setPassword("java");
        return dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(PocApplication.class);
        
//        ProductDetail detail = new ProductDetail();
//        detail.setProductId("ABCD1234");
//        detail.setProductName("O livro de Dan sobre a escrita");
//        detail.setShortDescription("Um livro sobre como escrever livros.");
//        detail.setLongDescription("Neste livro Dan apresenta ao leitor técnicas sobre como escrever livros.");
//        detail.setInventoryId("009178461");
//        ProductDetail repository = ctx.getBean(ProductDetailRepository.class);
//        repository.save(detail);
//        for (ProductDetail productDetail : repository.findAll()) {
//            System.out.println(productDetail.getProductId());
//        }
    }
}
