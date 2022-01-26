package TestsDAO;

import org.junit.Assert;
import persistence.commons.ConnectionProvider;

import java.sql.Connection;
import java.sql.SQLException;

public class CarDAOImplTest {

    @org.junit.Test
    public void testConnectionOk() throws SQLException {
        Connection connection = ConnectionProvider.getConnection();
        Assert.assertNotNull(connection);
    }
}