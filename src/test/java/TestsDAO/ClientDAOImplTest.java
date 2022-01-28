package TestsDAO;

import model.Client;
import org.junit.Assert;
import org.junit.Test;
import persistence.commons.ConnectionProvider;
import persistence.impl.ClientDAOImpl;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class ClientDAOImplTest {

    @Test
    public void testConnectionOk() throws SQLException {
        Connection connection = ConnectionProvider.getConnection();
        Assert.assertNotNull(connection);
    }

    @Test
    public void findById() {
        ClientDAOImpl clientDAO = new ClientDAOImpl();
        Client client = clientDAO.findById(1);

        assertNotNull(client);
        assertEquals(Integer.valueOf(1),client.getId());
        assertEquals("calle 1", client.getAddress());
    }
}