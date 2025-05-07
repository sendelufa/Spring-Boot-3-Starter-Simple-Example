package com.example.demo;

import com.example.starter.autoconfigure.ExampleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

  @Value("${my.custom.property.generated}")
  private String generatedProperty;

  @Value("${my.custom.app.name}")
  private String customAppName;

  // Это свойство может быть переопределено в application.properties
  @Value("${my.app.setting:Default Setting from Code}")
  private String appSetting;


  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Bean
  public CommandLineRunner runner(ExampleService service) {

    System.out.println("--- Properties in Component ---");
    System.out.println("Generated Property: " + generatedProperty);
    System.out.println("Custom App Name: " + customAppName);
    System.out.println("App Setting: " + appSetting);

    return args -> System.out.println(service.hello());

  }
}

