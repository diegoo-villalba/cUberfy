package persistence;

import model.Driver;
import persistence.commons.GenericDAO;

public interface DriverDAO extends GenericDAO<Driver> {

    Driver findByLicense(Integer license);
}
