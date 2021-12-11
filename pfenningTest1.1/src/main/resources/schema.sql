CREATE TABLE driver
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_pf     int         not null,
    id_rewe   int         NOT NULL,
    name      varchar(40) NOT NULL,
    last_name varchar(40) NOT NULL,
    hire_date varchar(20) NOT NULL,
    end_hire  varchar(20) DEFAULT NULL

);
CREATE TABLE truck
(
    id    BIGINT AUTO_INCREMENT PRIMARY KEY,
    plate varchar(20) NOT NULL

);

Create table markt
(
    id    Bigint auto_increment primary key,
    nr    int not null,
    adres varchar(100)
);

CREATE TABLE tour
(
    id            BIGINT AUTO_INCREMENT PRIMARY KEY,
    nr_rewe       varchar(10) not null,
    date          date        not null,
    distance_rewe int         NOT NULL,
    distance      int         NOT NULL,
    time_start    timestamp   NOT NULL,
    time_end      timestamp   NOT NULL,
    truck_id      BIGINT      NOT NULL,
    driver_id     BIGINT      NOT NULL,

    CONSTRAINT tour_driver_id FOREIGN KEY (driver_id) REFERENCES driver (id),
    CONSTRAINT tour_truck_id FOREIGN KEY (truck_id) REFERENCES truck (id)
);

CREATE TABLE destination_ware
(
    id       bigint auto_increment primary key,
    tour_id  bigint NOT NULL,
    markt_id bigint NOT NULL,
    roli     int DEFAULT 0,
    palet    int DEFAULT 0,
    M1       int DEFAULT 0,
    M2       int DEFAULT 0,
    M4       int DEFAULT 0,
    TK_box   int DEFAULT 0,
    --KEY destination_ware_markt (markt_id_markt),
    CONSTRAINT destination_ware_markt FOREIGN KEY (markt_id) REFERENCES markt (id),
    CONSTRAINT destination_ware_tour FOREIGN KEY (tour_id) REFERENCES tour (id)
);




