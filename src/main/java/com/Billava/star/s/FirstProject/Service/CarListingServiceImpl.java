package com.Billava.star.s.FirstProject.Service;

import org.springframework.stereotype.Service;

import com.Billava.star.s.FirstProject.Entity.CarListing;
import com.Billava.star.s.FirstProject.Repository.CarListingRepository;
import com.Billava.star.s.FirstProject.Response.CarListingDto;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CarListingServiceImpl implements CarListingService {

	private CarListingRepository carListingRepository;

	public CarListingServiceImpl(CarListingRepository carListingRepository) {

		this.carListingRepository = carListingRepository;
	}

	@Override
	public CarListingDto carList(CarListing carListing) {

		log.info("Adding CarListing");

		CarListing car = CarListing.builder().brand(carListing.getBrand()).year(carListing.getYear())
				.fuel(carListing.getFuel()).transmission(carListing.getTransmission())
				.kmdriven(carListing.getKmdriven()).numberofowners(carListing.getNumberofowners())
				.sdtitle(carListing.getSdtitle()).additionalinformation(carListing.getAdditionalinformation())
				.build();

		carListingRepository.save(car);

		log.info("Car Listing Created");
		
		CarListingDto response = CarListingDto.builder().id(car.getId()).brand(car.getBrand()).year(car.getYear())
				.fuel(car.getFuel()).transmission(car.getTransmission()).kmdriven(car.getKmdriven())
				.numberofowners(car.getNumberofowners()).sdtitle(car.getSdtitle()).additionalinformation(car.getAdditionalinformation())
				.build();

		return response;

	}

}
