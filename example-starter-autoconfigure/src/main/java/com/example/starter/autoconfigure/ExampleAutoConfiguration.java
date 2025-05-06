package com.example.starter.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@ConditionalOnProperty(
    prefix = "example.starter",
    name = "enabled",
    havingValue = "true",
    matchIfMissing = true
)
public class ExampleAutoConfiguration {

  @Bean
  public ExampleService exampleService() {
    return new ExampleService();
  }
}
