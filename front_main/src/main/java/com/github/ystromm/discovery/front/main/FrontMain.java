package com.github.ystromm.discovery.front.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.github.ystromm.springboot.webjars.WebjarVersionFilter;

/**
 * The main for the frontend server serving the web ui and
 * the rest resources and websockets.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses={WebjarVersionFilter.class})
public class FrontMain {

    // Need to be visible for Spring
    FrontMain() {
        // empty
    }

    public static void main(String[] args) {
        SpringApplication.run(FrontMain.class, args);
    }
}
