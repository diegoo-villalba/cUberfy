package persistence.impl;

import model.Client;
import model.Driver;
import persistence.ClientDAO;
import persistence.commons.ConnectionProvider;
import persistence.commons.MissingDataException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ClientDAOImpl implements ClientDAO {
    @Override
    public Client findById(Integer id) {
        try {
            String sql = "SELECT * FROM clientes WHERE id = ?";
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            Client client = null;

            if (result.next()) {
                client = toClient(result);
            }

            return client;
        } catch (Exception e) {
            e.printStackTrace();
            throw new MissingDataException(e);
        }
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public int countAll() {
        return 0;
    }

    @Override
    public int insert(Client client) {
        return 0;
    }

    @Override
    public int update(Client client) {
        return 0;
    }

    @Override
    public int delete(Client client) {
        return 0;
    }
    //Client(Integer id, Integer addressNumber, String address, String location)
    public static Client toClient(ResultSet resultSet){
        try {

            Integer id = resultSet.getInt("id");
            Integer addressNumber = resultSet.getInt("numero");
            String address = resultSet.getString("calle");
            String location = resultSet.getString("localidad");
            Client client = new Client(id, addressNumber, address, location);
            return client;

        } catch (Exception e) {
            e.printStackTrace();
            throw new MissingDataException(e);
        }

    }
}
