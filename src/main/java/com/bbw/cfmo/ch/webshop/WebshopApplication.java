package com.bbw.cfmo.ch.webshop;

import com.bbw.cfmo.ch.webshop.model.Product;
import com.bbw.cfmo.ch.webshop.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebshopApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "Spore", 30.00, "https://images-na.ssl-images-amazon.com/images/I/51xcZUN5UAL._SY445_.jpg"));
            productService.save(new Product(2L, "Monster Hunter: World", 45.90, "https://images-na.ssl-images-amazon.com/images/I/91qC3P08FCL._SY445_.jpg"));
            productService.save(new Product(3L, "Anthem", 60.00, "https://images-na.ssl-images-amazon.com/images/I/91IgHijZghL._SY445_.jpg"));
        };
    }

}
