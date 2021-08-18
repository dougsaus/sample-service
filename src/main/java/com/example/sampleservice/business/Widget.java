package com.example.sampleservice.business;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Widget {

	private String id;

	private String name;

	private String usage;

}
