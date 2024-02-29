package com.directi.training.srp.exercise;

class CarComparator {
    CarDatabase db;
    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : db._carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}