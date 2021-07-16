package airi.kr.jenkinstest;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
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

    List<String> tmp = new ArrayList<>();
    tmp.add("a");
    tmp.add("B");
    tmp.add("C");
    System.out.println(tmp.stream().map(a -> a + "a").findFirst());
    return "version 02";

  }
}
