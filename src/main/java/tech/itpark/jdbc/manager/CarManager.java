package tech.itpark.jdbc.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import tech.itpark.jdbc.mapper.CarRowMapper;
import tech.itpark.jdbc.model.Car;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class CarManager {
    private final NamedParameterJdbcTemplate template;
    private final CarRowMapper rowMapper = new CarRowMapper();

    public List<Car> getAll() {
        return template.query(
                "SELECT id, vendor_id, name, price, power, body_type, equip, gearbox, color FROM cars ORDER BY id LIMIT 20",
                rowMapper
        );
    }

    public Car getById(long id) {
        return template.queryForObject(
                "SELECT id, vendor_id, name, price, power, body_type, equip, gearbox, color FROM cars WHERE id = :id",
                Map.of("id", id),
                rowMapper
        );
    }


    public List<Car> getByVendorId(long vendorId) {
        return template.query(
                "SELECT id, vendor_id, name, price, power, body_type, equip, gearbox, color FROM cars WHERE vendor_id = :vendor_id",
                Map.of("vendor_id", vendorId),
                rowMapper
        );
    }


    public List<Car> getByBodyType(String bodyType) {
        return template.query(
                "SELECT id, vendor_id, name, price, power, body_type, equip, gearbox, color FROM cars WHERE body_type = :body_type",
                Map.of("body_type", bodyType),
                rowMapper
        );
    }

    public List<Car> getByEquip(String equip) {
        return template.query(
                "SELECT id, vendor_id, name, price, power, body_type, equip, gearbox, color FROM cars WHERE equip = :equip",
                Map.of("equip", equip),
                rowMapper
        );
    }

    public List<Car> getByGearbox(String gearbox) {
        return template.query(
                "SELECT id, vendor_id, name, price, power, body_type, equip, gearbox, color FROM cars WHERE gearbox = :gearbox",
                Map.of("gearbox", gearbox),
                rowMapper
        );
    }

    public List<Car> getByColor(String color) {
        return template.query(
                "SELECT id, vendor_id, name, price, power, body_type, equip, gearbox, color FROM cars WHERE color = :color",
                Map.of("color", color),
                rowMapper
        );
    }

    public List<Car> search(String color, String gearbox) {
        return template.query(
                "SELECT id, vendor_id, name, price, power, body_type, equip, gearbox, color FROM cars WHERE color = :color AND gearbox = :gearbox",
                Map.of("color", color, "gearbox", gearbox),
                rowMapper
        );
    }

    public Car save(Car item) {
        if (item.getId() == 0) {
            KeyHolder keyHolder = new GeneratedKeyHolder();
            template.update(
                    "INSERT INTO cars(vendor_id, name, price, power, body_type, equip, gearbox, color) " +
                            "VALUES (:vendor_id, :name, :price, :power, :body_type, :equip, :gearbox, :color)",
                    new MapSqlParameterSource(Map.of(
                            "vendor_id", item.getVendorId(),
                            "name", item.getName(),
                            "price", item.getPrice(),
                            "power", item.getPower(),
                            "body_type", item.getBodyType(),
                            "equip", item.getEquip(),
                            "gearbox", item.getGearbox(),
                            "color", item.getColor()
                    )),
                    keyHolder
            );

            long id = keyHolder.getKey().longValue();
            return getById(id);
        }

        template.update(
                "UPDATE cars " +
                        "SET vendor_id = :vendor_id, name = :name, price = :price, power = :power, body_type = :body_type, equip = :equip, gearbox = :gearbox, color = :color" +
                        " WHERE id = :id",
                Map.of(
                        "vendor_id", item.getVendorId(),
                        "name", item.getName(),
                        "price", item.getPrice(),
                        "power", item.getPower(),
                        "body_type", item.getBodyType(),
                        "equip", item.getEquip(),
                        "gearbox", item.getGearbox(),
                        "color", item.getColor()
                )
        );
        return getById(item.getId());
        }

    public Car removeById(long id) {
        final Car item = getById(id);

        template.update(
                "DELETE FROM cars WHERE id = :id",
                Map.of("id", item.getId())
        );

        return item;
    }
}