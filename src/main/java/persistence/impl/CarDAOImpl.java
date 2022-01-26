package persistence.impl;


import model.Car;
import persistence.CarDAO;
import persistence.commons.ConnectionProvider;
import persistence.commons.MissingDataException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class CarDAOImpl implements CarDAO {

    @Override
    public Car findByPlate(String plate) {
        try {
            String sql = "SELECT * FROM autos WHERE patente = ?";
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, plate);
            ResultSet resultados = statement.executeQuery();

            Car car = null;

            if (resultados.next()) {
                car = toCar(resultados);
            }

            return car;
        } catch (Exception e) {
            e.printStackTrace();
            throw new MissingDataException(e);
        }
    }

    @Override
    public List<Car> findAll() {
        return null;
    }

    @Override
    public int countAll() {
        return 0;
    }

    @Override
    public int insert(Car car) {
        return 0;
    }

    @Override
    public int update(Car car) {
        return 0;
    }

    @Override
    public int delete(Car car) {
        return 0;
    }

    public static Car toCar(ResultSet resultSet){
    try {
        String plate = resultSet.getString("patente");
        String brand = resultSet.getString("marca");
        String model = resultSet.getString("modelo");
        int year = resultSet.getInt("año");

        Car car = new Car(model, year, plate, brand);
        return car;

    } catch (Exception e) {
        e.printStackTrace();
        throw new MissingDataException(e);
    }

    }
}
