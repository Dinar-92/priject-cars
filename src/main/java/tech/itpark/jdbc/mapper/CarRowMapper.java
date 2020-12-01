package tech.itpark.jdbc.mapper;

import org.springframework.jdbc.core.RowMapper;
import tech.itpark.jdbc.model.Car;


import java.sql.ResultSet;
import java.sql.SQLException;

public class CarRowMapper implements RowMapper<Car> {
    public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Car(
                rs.getLong("id"),
                rs.getLong("vendor_id"),
                rs.getString("name"),
                rs.getInt("price"),
                rs.getInt("power"),
                rs.getString("body_type"),
                rs.getString("equip"),
                rs.getString("gearbox"),
                rs.getString("color")
        );
    }
}
