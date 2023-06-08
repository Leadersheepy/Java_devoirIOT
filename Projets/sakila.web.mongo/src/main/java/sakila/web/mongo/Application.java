package sakila.web.mongo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
@Slf4j
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	private LocalDateTime startTime;

	@Value("${server.port}")
	private int serverPort;

	@Value("${server.servlet.context-path}")
	private String rootPath;

	@Override
	public void run(String... args) throws Exception {
		var url = String.format("http://localhost:%d%s",serverPort,rootPath);
		log.info("Start Server url :{}",url);
	}


	@Bean
	public LocalDateTime getStartTime(){
		if ( startTime == null)
			startTime = LocalDateTime.now();
		return startTime;
	}


}



