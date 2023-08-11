package dev.meko.contentcalendar;

import dev.meko.contentcalendar.config.ContentCalendarProperties;
import dev.meko.contentcalendar.model.Content;
import dev.meko.contentcalendar.model.Status;
import dev.meko.contentcalendar.model.Type;
import dev.meko.contentcalendar.repository.ContentCollectionRepository;
import dev.meko.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}
