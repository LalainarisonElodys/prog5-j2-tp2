package org.hei.location.controller;

import org.hei.location.entity.*;
import org.hei.location.service.RentalService;

import java.time.LocalDate;

public class RentalController {
    private RentalService rentalService = new RentalService();
    public void run(){
        Locatable bike = new Bike("Royal men", 1000.0);
        Rentable person = new Person("Dee","0329652692","Ivato");

        Rental rental = new Rental(
                bike,
                person,
                LocalDate.of(2025, 11, 30),
                LocalDate.of(2025, 12, 10),
                10.0
        );
        rentalService.processRental(rental);
    }
}
