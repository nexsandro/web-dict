package org.jlabs.webdict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "org.jlabs.webdict.web" })
public class App {
    public static void main(String[] args) {
        new SpringApplication(App.class).run(args);
    }
}
