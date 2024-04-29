package com.Billava.star.s.FirstProject.Response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarListingDto {

	private long id;

	private String brand;

	private int year;

	private String fuel;

	private String transmission;

	private int kmdriven;

	private int numberofowners;

	private String sdtitle;

	private String additionalinformation;

	

}
