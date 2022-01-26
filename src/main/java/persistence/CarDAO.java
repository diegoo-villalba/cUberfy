package persistence;

import model.Car;
import persistence.commons.GenericDAO;

public interface CarDAO extends GenericDAO<Car> {

    Car findByPlate(String plate);

}
