package com.example.sampleservice.business;

import java.util.Map;

public interface WidgetService {

	Map<String, Widget> getAllWidgets();

	Widget getWidget(String id);

}
