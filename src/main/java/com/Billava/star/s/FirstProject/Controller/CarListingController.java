package com.Billava.star.s.FirstProject.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Billava.star.s.FirstProject.Entity.CarListing;
import com.Billava.star.s.FirstProject.Response.CarListingDto;
import com.Billava.star.s.FirstProject.Service.CarListingService;

@RestController
@RequestMapping("/api")
public class CarListingController {

	private CarListingService carListingService;

	public CarListingController(CarListingService carListingService) {

		this.carListingService = carListingService;
	}
    
	@PostMapping("/sell")
	public ResponseEntity<CarListingDto> carList(@RequestBody CarListing carListing) {
		return new ResponseEntity<>(carListingService.carList(carListing), HttpStatus.CREATED);

	}

}
