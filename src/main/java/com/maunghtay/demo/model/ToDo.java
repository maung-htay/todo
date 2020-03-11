package com.maunghtay.demo.model;

import java.util.UUID;

import lombok.Data;

@Data
public class ToDo {
	private String id;
	private String name;
	public ToDo() {
	 this.id = UUID.randomUUID().toString();
	}
	
	
}
