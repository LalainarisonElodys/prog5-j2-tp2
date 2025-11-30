package org.hei.location.service;

import org.hei.location.entity.Rental;
import org.hei.location.manager.RentalManager;

public class RentalService {
    private static RentalManager rentalManager = new RentalManager();

    public void processRental(Rental rental) {
        rentalManager.rent(rental);
    }
}
