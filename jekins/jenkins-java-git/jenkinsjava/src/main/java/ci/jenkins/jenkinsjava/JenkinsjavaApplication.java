package ci.jenkins.jenkinsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsjavaApplication.class, args);
		System.out.println("Hello World!");
	}

}
