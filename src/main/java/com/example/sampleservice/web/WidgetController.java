package com.example.sampleservice.web;

import com.example.sampleservice.business.Widget;
import com.example.sampleservice.business.WidgetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/widgets")
@RequiredArgsConstructor
@ConditionalOnProperty(value = "entry-point", havingValue = "web", matchIfMissing = true)
public class WidgetController {

	private final WidgetService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Widget> getWidgets() {
		log.info("Starting Controller.getWidgets()");

		return service.getAllWidgets();
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Widget getWidget(@PathVariable final String id) {
		log.info("Starting Controller.getWidget() id:{}", id);

		return service.getWidget(id);
	}

}
