package se.ystrom.push.front.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main for the frontend server serving the web ui and
 * the rest resources and websockets.
 */
@SpringBootApplication
public class FrontMain {

    // Need to be visible for Spring
    FrontMain() {
        // empty
    }

    public static void main(String[] args) {
        SpringApplication.run(FrontMain.class, args);
    }
}
