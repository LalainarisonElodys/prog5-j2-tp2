package org.hei.location.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental {
    private Locatable item;
    private Rentable renter;
    private LocalDate startDate;
    private LocalDate endDate;
    private double pricePerDay;

    public Rental(Locatable item, Rentable renter, LocalDate startDate, LocalDate endDate, double pricePerDay) {
        this.item = item;
        this.renter = renter;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerDay = pricePerDay;
    }
    public long getDurationDays(){
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public double getTotalPrice(){
        return getDurationDays() * pricePerDay;
    }
}
