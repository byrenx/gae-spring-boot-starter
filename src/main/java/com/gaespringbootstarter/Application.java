package com.gaespringbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by byrenx on 10/24/16.
 */
@SpringBootApplication
public class Application {

     public static void main(String[] args) {
         ConfigurableApplicationContext context = SpringApplication.run(Application.class);
     }
}
