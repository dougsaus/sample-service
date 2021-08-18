package com.example.sampleservice.task;

import com.example.sampleservice.business.WidgetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
@ConditionalOnProperty(value = "entry-point", havingValue = "task")
@RequiredArgsConstructor
public class WidgetTask {

	private final WidgetService service;

	private final ConfigurableApplicationContext context;

	@Bean
	public CommandLineRunner jobRunner() {
		return (args) -> {
			try {
				log.info("Starting Widget Task...");

				log.info("All Widgets: {}", service.getAllWidgets());

				log.info("Completed Widget Task...");
			}
			finally {
				context.close();
			}
		};
	}

}
