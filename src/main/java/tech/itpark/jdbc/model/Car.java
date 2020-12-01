package tech.itpark.jdbc.model;

import lombok.Value;

@Value
public class Car {
    long id;
    long vendorId;
    String name;
    int price;
    int power;
    String bodyType;
    String equip;
    String gearbox;
    String color;
}
