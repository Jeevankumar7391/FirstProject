package com.Billava.star.s.FirstProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "carlisting")
public class CarListing {

	public static final String HttpStatus = null;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "brand")
	private String brand;

	@Column(name = "year")
	private int year;

	@Column(name = "fuel")
	private String fuel;

	@Column(name = "transmission")
	private String transmission;

	@Column(name = "kmdriven")
	private int kmdriven;

	@Column(name = "numberofowners")
	private int numberofowners;

	@Column(name = "sdtitle")
	private String sdtitle;

	@Column(name = "additionalinformation")
	private String additionalinformation;

}
