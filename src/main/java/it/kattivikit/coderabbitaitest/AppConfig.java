package it.kattivikit.coderabbitaitest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@EnableWebFlux
@ComponentScan("it.kattivikit.coderabbitaitest")
public class AppConfig {
}
