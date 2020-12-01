CREATE TABLE vendors
(
    id   INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT NOT NULL

);

CREATE TABLE cars
(
    id        INTEGER PRIMARY KEY AUTO_INCREMENT,
    vendor_id INTEGER NOT NULL REFERENCES vendors,
    name      TEXT    NOT NULL,
    price     INTEGER NOT NULL CHECK (price > 0),
    power     INTEGER NOT NULL CHECK (power > 0),
    body_type TEXT    NOT NULL,
    equip     TEXT    NOT NULL,
    gearbox   TEXT    NOT NULL,
    color     TEXT    NOT NULL
);