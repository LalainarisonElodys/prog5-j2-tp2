package org.hei.location.manager;

import org.hei.location.entity.Rental;
import org.hei.location.exceptions.RentalException;

import java.util.logging.Logger;

public class RentalManager {
    private static final Logger logger = Logger.getLogger(RentalManager.class.getName());

    public void rent(Rental rental) {
        if(rental == null) {
            logger.severe("Rental is null");
            throw new RentalException("Rental cannot be null");
        }
        logger.info("Renting: " + rental.getItem().getName() +
                "to" + rental.getRenter().getRenterType() +
                "for" + rental.getDurationDays() + "days" +
                "total coast: " + rental.getTotalPrice());
    }
}
