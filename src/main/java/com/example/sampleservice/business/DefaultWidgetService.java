package com.example.sampleservice.business;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class DefaultWidgetService implements WidgetService {

	@Override
	public Map<String, Widget> getAllWidgets() {
		return getSampleData();
	}

	@Override
	public Widget getWidget(String id) {
		return getSampleData().get(id);
	}

	Map<String, Widget> getSampleData() {
		return Map.of("1", Widget.builder().id("1").name("ima-widget").usage("useful thing").build(), "2",
				Widget.builder().id("2").name("im-also-a-widget").usage("less-than-useful thing").build());

		// return Map.of("1", Widget.builder().id("1").name("ima-widget").usage("useful
		// thing").build(), "2",
		// Widget.builder().id("2").name("im-also-a-widget").usage("less-than-useful
		// thing").build(), "3",
		// Widget.builder().id("3").name("the widgetest").usage("the most useful
		// thing").build());

	}

}
