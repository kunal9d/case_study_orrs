package com.example.user.model;

import javax.validation.constraints.NotBlank;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Document(collection = "Orders")
public class BookingOrder {

	@Id
	
	private String id;
	
	@NotBlank(message="Please mention the quantity")
	private String quantity;
	
	@NotBlank(message="Please mention the Start Station")
	private String startStation;
	
	@NotBlank(message="Please mention the End Station")
	private String endStation;
	
	public BookingOrder() {
		
	}

	public BookingOrder(String id, String quantity, String startStation, String endStation) {
		this.id = id;
		this.quantity = quantity;
		this.startStation = startStation;
		this.endStation = endStation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getEndStation() {
		return endStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	@Override
	public String toString() {
		return "BookingOrder [id=" + id + ", quantity=" + quantity + ", startStation=" + startStation + ", endStation="
				+ endStation + "]";
	}



}