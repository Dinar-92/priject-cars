package tech.itpark.jdbc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.itpark.jdbc.manager.CarManager;
import tech.itpark.jdbc.model.Car;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarManager manager;

    @GetMapping
    public List<Car> getAll() {
        return manager.getAll();
    }

    @GetMapping("/{id}")
    public Car getById(@PathVariable long id) {
        return manager.getById(id);
    }

    @GetMapping("/by-vendor/{vendorId}")
    public List<Car> getByVendorId(@PathVariable long vendorId) {
        return manager.getByVendorId(vendorId);
    }

    @GetMapping("/by-bodyType/{bodyType}")
    public List<Car> getByBodyType(@PathVariable String bodyType) {
        return manager.getByBodyType(bodyType);
    }

    @GetMapping("/by-equip/{equip}")
    public List<Car> getByEquip(@PathVariable String equip) {
        return manager.getByEquip(equip);
    }

    @GetMapping("/by-gearbox/{gearbox}")
    public List<Car> getByGearbox(@PathVariable String gearbox) {
        return manager.getByGearbox(gearbox);
    }

    @GetMapping("/by-color/{color}")
    public List<Car> getByColor(@PathVariable String color) {
        return manager.getByColor(color);
    }

    @GetMapping("/search")
    public List<Car> search(@RequestParam String color, @RequestParam String gearbox) {
        return manager.search(color, gearbox);
    }

    @PostMapping
    public Car save(@RequestBody Car item) {
        return manager.save(item);
    }

    @DeleteMapping("/{id}")
    public Car removeById(@PathVariable long id) {
        return manager.removeById(id);
    }
}