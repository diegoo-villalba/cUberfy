package TestsDAO;

import model.Car;
import org.junit.Assert;
import persistence.commons.ConnectionProvider;
import persistence.impl.CarDAOImpl;

import java.sql.Connection;
import java.sql.SQLException;

public class CarDAOImplTest {

    @org.junit.Test
    public void testConnectionOk() throws SQLException {
        Connection connection = ConnectionProvider.getConnection();
        Assert.assertNotNull(connection);
    }
    @org.junit.Test
    public void testFindByPlate() {
        CarDAOImpl carDAO = new CarDAOImpl();

        Car car = carDAO.findByPlate("CVX373");
        Assert.assertNotNull(car);
        Assert.assertEquals(Integer.valueOf(2000), car.getYear());
        Assert.assertEquals("Audi", car.getBrand());

    }

}