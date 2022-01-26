package model;

import java.time.Clock;

public class Car {
    private String model, plate, brand;
    private Integer year;

    public Car(String model, Integer year, String plate, String brand) {
        this.model = model;
        this.year = year;
        this.plate = plate;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
