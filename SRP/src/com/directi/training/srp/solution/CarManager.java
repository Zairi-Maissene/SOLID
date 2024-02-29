package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    CarDatabase db;
    CarComparator cp;
    CarFormatter cf;

    public Car getFromDb(final String carId)
    {
        db.getById(carId);
    }

    public String getCarsNames()
    {
        cf.getCarNames()
    }

    public Car getBestCar()
    {
       cp.getBestCar()
    }
}
