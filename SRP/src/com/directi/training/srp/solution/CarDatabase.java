package com.directi.training.srp.exercise;

class CarDatabase {
    private List<Car> _carsDb = Arrays
            .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
                    new Car("3", "Megane", "Renault"));

    public Car getById(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
    // Other db methods...
    public Car createCar() {

    }
    public Car deleteCar() {

    }
    //
    //.....

}