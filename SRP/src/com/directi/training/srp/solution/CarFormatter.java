package com.directi.training.srp.exercise;

class CarFormatter {
    CarDatabase db;
    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : db._carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}