INSERT INTO vendors (id, name)
VALUES (1, 'Kia'),
       (2, 'Lada'),
       (3, 'Renault'),
       (4, 'Toyota');

INSERT INTO cars (vendor_id, name, price, power, body_type, equip, gearbox, color)
VALUES (1, 'Rio', 800, 99, 'sedan', 'standard', 'manual', 'white'),
       (1, 'Picanto', 700, 85, 'hatcback', 'standard', 'automatic', 'black'),
       (1, 'Cerato', 700, 124, 'sedan', 'premium', 'manual', 'red'),
       (1, 'Ceed', 1100, 125, 'hatcback', 'standard', 'manual', 'gray'),
       (2, 'Granta', 600, 87, 'hatcback', 'standard', 'automatic', 'green'),
       (2, 'Vesta', 900, 106, 'wagon', 'comfort', 'automatic', 'green'),
       (2, 'Xray', 950, 106, 'hatcback', 'comfort', 'manual', 'blue'),
       (2, '4x4', 650, 85, 'suv', 'comfort', 'manual', 'purple'),
       (3, 'Logan', 750, 82, 'sedan', 'comfort', 'manual', 'white'),
       (3, 'Sandero', 850, 106, 'hatcback', 'comfort', 'manual', 'blue'),
       (3, 'Duster', 1150, 114, 'suv', 'comfort', 'manual', 'purple'),
       (3, 'Arkana', 1350, 114, 'suv', 'comfort', 'automatic', 'black'),
       (3, 'Logan', 730, 114, 'sedan', 'comfort', 'automatic', 'black'),
       (4, 'Corolla', 980, 104, 'sedan', 'comfort', 'automatic', 'black'),
       (4, 'Rav4', 1730, 114, 'suv', 'standard', 'automatic', 'blue'),
       (4, 'Fortuner', 3730, 249, 'suv', 'premium', 'automatic', 'blue'),
       (4, 'Land Cruiser', 4870, 249, 'suv', 'premium', 'automatic', 'red');