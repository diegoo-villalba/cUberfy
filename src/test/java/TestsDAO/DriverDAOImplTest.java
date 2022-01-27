package TestsDAO;

import model.Car;
import model.Driver;
import org.junit.Assert;
import org.junit.Test;
import persistence.commons.ConnectionProvider;
import persistence.impl.CarDAOImpl;
import persistence.impl.DriverDAOImpl;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DriverDAOImplTest {

    @org.junit.Test
    public void testConnectionOk() throws SQLException {
        Connection connection = ConnectionProvider.getConnection();
        Assert.assertNotNull(connection);
    }

    @Test
    public void findByLicense() {
        DriverDAOImpl driverDAO = new DriverDAOImpl();

        Driver driver = driverDAO.findByLicense(101);
        Assert.assertNotNull(driver);
        Assert.assertEquals(Integer.valueOf(101), driver.getLicense());
        Assert.assertEquals("Dov", driver.getName());

    }
}