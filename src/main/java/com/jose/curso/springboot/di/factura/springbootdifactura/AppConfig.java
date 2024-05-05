package com.jose.curso.springboot.di.factura.springbootdifactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jose.curso.springboot.di.factura.springbootdifactura.models.Item;
import com.jose.curso.springboot.di.factura.springbootdifactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice(){
        return Arrays.asList(
            new Item(new Product("Xbox series X", 500.00), 2),
            new Item(new Product("Xbox series S", 300.00), 5),
            new Item(new Product("PS5", 500.00), 3),
            new Item(new Product("Monitor AOC 27 2k", 298.00), 1)
        );
    }
}
