package persistence.impl;

import model.Car;
import model.Driver;
import persistence.DriverDAO;
import persistence.commons.ConnectionProvider;
import persistence.commons.MissingDataException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class DriverDAOImpl implements DriverDAO {
    @Override
    public Driver findByLicense(Integer license) {
        try {
            String sql = "SELECT * FROM choferes WHERE numero_licencia = ?";
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, license);
            ResultSet result = statement.executeQuery();

            Driver driver = null;

            if (result.next()) {
                driver = toDriver(result);
            }

            return driver;
        } catch (Exception e) {
            e.printStackTrace();
            throw new MissingDataException(e);
        }
    }

    @Override
    public List<Driver> findAll() {
        return null;
    }

    @Override
    public int countAll() {
        return 0;
    }

    @Override
    public int insert(Driver driver) {
        return 0;
    }

    @Override
    public int update(Driver driver) {
        return 0;
    }

    @Override
    public int delete(Driver driver) {
        return 0;
    }


    public static Driver toDriver(ResultSet resultSet){
        try {
            String name = resultSet.getString("nombre");
            String lastName = resultSet.getString("apellido");
            String email = resultSet.getString("mail");
            int license = resultSet.getInt("numero_licencia");
            int dateOfAdmission = resultSet.getInt("fecha_ingreso");
            int departureDate = resultSet.getInt("fecha_egreso");
            int daysWorking = resultSet.getInt("dias_trabajados");

            Driver driver = new Driver(name, lastName, email, license, dateOfAdmission, departureDate, daysWorking);
            return driver;

        } catch (Exception e) {
            e.printStackTrace();
            throw new MissingDataException(e);
        }

    }

}
