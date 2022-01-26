package persistence.commons;

import model.Car;
import persistence.CarDAO;
import persistence.impl.CarDAOImpl;

public class DAOFactory {

    public static CarDAO getCarDAO() {
        return new CarDAOImpl();
    }
/*
    public static DriverDAO getDriverDAO() {
        return new DriverDAOImpl();
    }

    public static ClientDAO getClientDAO() {
        return new ClientDAOImpl();
    }
*/
}
