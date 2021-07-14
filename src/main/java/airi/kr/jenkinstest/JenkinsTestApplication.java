package airi.kr.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(JenkinsTestApplication.class, args);
  }

  @GetMapping(value="/")
  public String home() {
    return "version 1";
  }
}