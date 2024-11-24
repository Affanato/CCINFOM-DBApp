-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema dbgym
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dbgym
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbgym` DEFAULT CHARACTER SET utf8 ;
USE `dbgym` ;

-- -----------------------------------------------------
-- Table `dbgym`.`members`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`members` (
  `member_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `last_name` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `birthdate` DATE NOT NULL,
  `sex` ENUM('M', 'F', 'N', 'U') NOT NULL,
  `phone_number` CHAR(11) NOT NULL,
  `street` VARCHAR(128) NOT NULL,
  `barangay` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `province` VARCHAR(45) NULL,
  PRIMARY KEY (`member_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`subscription_types`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`subscription_types` (
  `subscription_type_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `subscription_type_name` VARCHAR(45) NOT NULL,
  `subscription_type_price` DECIMAL(10,2) UNSIGNED NOT NULL,
  PRIMARY KEY (`subscription_type_id`),
  UNIQUE INDEX `membership_type_UNIQUE` (`subscription_type_name` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`subscriptions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`subscriptions` (
  `subscription_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `member_id` INT UNSIGNED NOT NULL,
  `subscription_type_id` INT UNSIGNED NOT NULL,
  `subscription_start_date` DATE NOT NULL,
  `subscription_end_date` DATE NOT NULL,
  PRIMARY KEY (`subscription_id`),
  INDEX `fk_subscriptions_subscription_types1_idx` (`subscription_type_id` ASC) VISIBLE,
  INDEX `fk_subscriptions_members1_idx` (`member_id` ASC) VISIBLE,
  CONSTRAINT `fk_subscriptions_subscription_types1`
    FOREIGN KEY (`subscription_type_id`)
    REFERENCES `dbgym`.`subscription_types` (`subscription_type_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_subscriptions_members1`
    FOREIGN KEY (`member_id`)
    REFERENCES `dbgym`.`members` (`member_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`trainers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`trainers` (
  `trainer_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `last_name` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `birthdate` DATE NOT NULL,
  `sex` ENUM('M', 'F', 'N', 'U') NOT NULL,
  `phone_number` CHAR(11) NOT NULL,
  `street` VARCHAR(128) NOT NULL,
  `barangay` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `province` VARCHAR(45) NULL,
  `program_specialty` VARCHAR(128) NOT NULL,
  `trainer_status` ENUM('Active', 'Inactive') NOT NULL,
  PRIMARY KEY (`trainer_id`),
  UNIQUE INDEX `phone_number_UNIQUE` (`phone_number` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`products` (
  `product_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `product_brand` VARCHAR(45) NOT NULL,
  `product_name` VARCHAR(45) NOT NULL,
  `product_description` VARCHAR(128) NULL,
  `product_price` DECIMAL(10,2) UNSIGNED NOT NULL,
  `available_quantity` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`product_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`product_purchases`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`product_purchases` (
  `product_purchase_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `member_id` INT UNSIGNED NOT NULL,
  `product_id` INT UNSIGNED NOT NULL,
  `quantity_sold` INT UNSIGNED NOT NULL,
  `purchase_datetime` DATETIME NOT NULL,
  PRIMARY KEY (`product_purchase_id`),
  INDEX `fk_product_purchases_products1_idx` (`product_id` ASC) VISIBLE,
  INDEX `fk_product_purchases_members1_idx` (`member_id` ASC) VISIBLE,
  CONSTRAINT `fk_product_purchases_products1`
    FOREIGN KEY (`product_id`)
    REFERENCES `dbgym`.`products` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_product_purchases_members1`
    FOREIGN KEY (`member_id`)
    REFERENCES `dbgym`.`members` (`member_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`amenities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`amenities` (
  `amenity_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `amenity_name` VARCHAR(45) NOT NULL,
  `walk_in_price_per_hour` DECIMAL(10,2) UNSIGNED NOT NULL,
  `opening_time` TIME NOT NULL,
  `closing_time` TIME NOT NULL,
  `amenity_status` ENUM('Active', 'Inactive') NOT NULL,
  PRIMARY KEY (`amenity_id`),
  UNIQUE INDEX `amenity_name_UNIQUE` (`amenity_name` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`subscription_type_amenities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`subscription_type_amenities` (
  `subscription_type_id` INT UNSIGNED NOT NULL,
  `amenity_id` INT UNSIGNED NOT NULL,
  INDEX `fk_membership_type_amenities_membership_types1_idx` (`subscription_type_id` ASC) VISIBLE,
  INDEX `fk_membership_type_amenities_amenities1_idx` (`amenity_id` ASC) VISIBLE,
  CONSTRAINT `fk_subscription_type_amenities_subscription_types1`
    FOREIGN KEY (`subscription_type_id`)
    REFERENCES `dbgym`.`subscription_types` (`subscription_type_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_subscription_type_amenities_amenities1`
    FOREIGN KEY (`amenity_id`)
    REFERENCES `dbgym`.`amenities` (`amenity_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`amenity_logs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`amenity_logs` (
  `amenity_log_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `member_id` INT UNSIGNED NOT NULL,
  `amenity_id` INT UNSIGNED NOT NULL,
  `usage_start_datetime` DATETIME NOT NULL,
  `usage_duration_hours` INT NOT NULL,
  `usage_total_price` DECIMAL(10,2) UNSIGNED NOT NULL,
  PRIMARY KEY (`amenity_log_id`),
  INDEX `fk_amenity_logs_members1_idx` (`member_id` ASC) VISIBLE,
  INDEX `fk_amenity_logs_amenities1_idx` (`amenity_id` ASC) VISIBLE,
  CONSTRAINT `fk_amenity_logs_members1`
    FOREIGN KEY (`member_id`)
    REFERENCES `dbgym`.`members` (`member_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_amenity_logs_amenities1`
    FOREIGN KEY (`amenity_id`)
    REFERENCES `dbgym`.`amenities` (`amenity_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`training_sessions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`training_sessions` (
  `training_session_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `subscription_id` INT UNSIGNED NOT NULL,
  `trainer_id` INT UNSIGNED NOT NULL,
  `session_start_datetime` DATETIME NOT NULL,
  `session_end_datetime` DATETIME NOT NULL,
  PRIMARY KEY (`training_session_id`),
  INDEX `fk_training_sessions_trainers1_idx` (`trainer_id` ASC) VISIBLE,
  INDEX `fk_training_sessions_subscriptions1_idx` (`subscription_id` ASC) VISIBLE,
  CONSTRAINT `fk_training_sessions_trainers1`
    FOREIGN KEY (`trainer_id`)
    REFERENCES `dbgym`.`trainers` (`trainer_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_training_sessions_subscriptions1`
    FOREIGN KEY (`subscription_id`)
    REFERENCES `dbgym`.`subscriptions` (`subscription_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Script to populate dbgym tables with entries.
-- -----------------------------------------------------
-- Subscription Types
INSERT INTO subscription_types (subscription_type_name, subscription_type_price)
VALUES
	('N/A', 0),
	('Standard', 4000),
	('Premium', 8000),
	('Deluxe', 12000),
	('VIP', 16000);


-- Amenities
INSERT INTO amenities (amenity_name, walk_in_price_per_hour, opening_time, closing_time, amenity_status)
VALUES
    ('N/A', 0, '00:00:00', '00:00:00', 'Inactive'),
	('Gym', 150, '09:00:00', '21:00:00', 'Active'),
	('Bathrooms', 150, '09:00:00', '21:00:00', 'Active'),
	('Showers & Changing Rooms', 150, '09:00:00', '21:00:00', 'Active'),
	('Lockers', 150, '09:00:00', '21:00:00', 'Active'),
	('Minibar', 150, '09:00:00', '21:00:00', 'Inactive'),
	('Pool', 300, '09:00:00', '21:00:00', 'Inactive'),
	('Sauna', 300, '09:00:00', '21:00:00', 'Inactive'),
	('Spa', 600, '09:00:00', '21:00:00', 'Inactive'),
	('Executive Lounge', 1200, '09:00:00', '21:00:00', 'Inactive');

-- Subscription Type Amenities
INSERT INTO subscription_type_amenities (subscription_type_id, amenity_id)
VALUES
    (2, 2),
    (2, 3),
    (2, 4),
    (3, 2),
    (3, 3),
    (3, 4),
    (3, 5),
    (3, 6),
    (4, 2),
    (4, 3),
    (4, 4),
    (4, 5),
    (4, 6),
    (4, 7),
    (4, 8),
    (5, 2),
    (5, 3),
    (5, 4),
    (5, 5),
    (5, 6),
    (5, 7),
    (5, 8),
    (5, 9),
    (5, 10);

-- Members
INSERT INTO members (last_name, first_name, birthdate, sex, phone_number, street, barangay, city, province)
VALUES
    ('N/A', 'N/A', '9999-01-01', 'U', '00000000000', 'N/A', 'N/A', 'N/A', 'N/A'),
    ('Smith', 'John', '1987-05-12', 'M', '09213456789', '1234 Elm St', 'Barangay 1', 'City 1', 'Province 1'),
    ('Johnson', 'Emily', '1993-11-01', 'F', '09214567890', '5678 Oak St', 'Barangay 2', 'City 2', 'Province 2'),
    ('Williams', 'Michael', '1989-08-15', 'M', '09215678901', '9101 Pine St', 'Barangay 3', 'City 3', 'Province 3'),
    ('Brown', 'Sarah', '1992-01-23', 'F', '09216789012', '1122 Cedar St', 'Barangay 4', 'City 4', 'Province 4'),
    ('Jones', 'David', '1986-03-10', 'M', '09217890123', '2233 Walnut St', 'Barangay 5', 'City 5', 'Province 5'),
    ('Miller', 'Olivia', '1990-07-25', 'F', '09218901234', '3344 Chestnut St', 'Barangay 6', 'City 6', 'Province 6'),
    ('Davis', 'Liam', '1985-05-30', 'M', '09219012345', '4455 Birch St', 'Barangay 7', 'City 7', 'Province 7'),
    ('Martinez', 'Sophia', '1994-09-14', 'F', '09220123456', '5566 Maple St', 'Barangay 8', 'City 8', 'Province 8'),
    ('Hernandez', 'Ethan', '1987-02-08', 'M', '09221234567', '6677 Oak St', 'Barangay 9', 'City 9', 'Province 9'),
    ('Cook', 'Avery', '1997-02-22', 'F', '09222345678', '7788 Pine St', 'Barangay 10', 'City 10', 'Province 10');

-- Amenity Logs
INSERT INTO amenity_logs (member_id, amenity_id, usage_start_datetime, usage_duration_hours, usage_total_price)
VALUES
    (2, 2, '2023-11-02 12:00:00', 1, 0),
    (3, 3, '2023-11-02 12:00:00', 2, 0),
    (4, 4, '2023-11-02 12:00:00', 3, 0),
    (5, 5, '2023-11-02 12:00:00', 4, 0),
    (6, 6, '2023-11-02 12:00:00', 5, 150.00 * 5),
    (7, 7, '2023-11-02 12:00:00', 1, 300.00 * 1),
    (8, 8, '2023-11-02 12:00:00', 2, 0),
    (9, 9, '2023-11-02 12:00:00', 3, 0),
    (10, 10, '2023-11-02 12:00:00', 4, 1200.00 * 4),
    (11, 2, '2023-11-02 12:00:00', 5, 0),
    (2, 2, '2023-12-15 12:00:00', 1, 150.00 * 1),
    (3, 3, '2023-12-15 12:00:00', 2, 150.00 * 2),
    (4, 4, '2023-12-15 12:00:00', 3, 150.00 * 3),
    (5, 5, '2023-12-15 12:00:00', 4, 150.00 * 4),
    (6, 6, '2023-12-15 12:00:00', 5, 150.00 * 5),
    (7, 7, '2023-12-15 12:00:00', 1, 300.00 * 1),
    (8, 8, '2023-12-15 12:00:00', 2, 300.00 * 2),
    (9, 9, '2023-12-15 12:00:00', 3, 600.00 * 3),
    (10, 10, '2023-12-15 12:00:00', 4, 1200.00 * 4),
    (11, 2, '2023-12-15 12:00:00', 5, 150.00 * 5);

-- Subscriptions
INSERT INTO subscriptions (member_id, subscription_type_id, subscription_start_date, subscription_end_date)
VALUES
    (1, 1, '9999-01-01', '9999-01-01'),
    (2, 2, '2023-11-01', DATE_ADD('2023-11-01', INTERVAL 30 DAY)),
    (3, 3, '2023-11-02', DATE_ADD('2023-11-02', INTERVAL 30 DAY)),
    (4, 4, '2023-11-03', DATE_ADD('2023-11-03', INTERVAL 30 DAY)),
    (5, 5, '2023-11-04', DATE_ADD('2023-11-04', INTERVAL 30 DAY)),
    (6, 2, '2023-11-05', DATE_ADD('2023-11-05', INTERVAL 30 DAY)),
    (7, 3, '2023-11-06', DATE_ADD('2023-11-06', INTERVAL 30 DAY)),
    (8, 4, '2023-11-07', DATE_ADD('2023-11-07', INTERVAL 30 DAY)),
    (9, 5, '2023-11-08', DATE_ADD('2023-11-08', INTERVAL 30 DAY)),
    (10, 2, '2023-11-09', DATE_ADD('2023-11-09', INTERVAL 30 DAY)),
    (11, 3, '2023-11-10', DATE_ADD('2023-11-10', INTERVAL 30 DAY)),
    (2, 4, '2024-01-01', DATE_ADD('2024-01-01', INTERVAL 30 DAY)),
    (3, 5, '2024-01-02', DATE_ADD('2024-01-02', INTERVAL 30 DAY)),
    (4, 2, '2024-01-03', DATE_ADD('2024-01-03', INTERVAL 30 DAY)),
    (5, 3, '2024-01-04', DATE_ADD('2024-01-04', INTERVAL 30 DAY)),
    (6, 4, '2024-01-05', DATE_ADD('2024-01-05', INTERVAL 30 DAY)),
    (7, 5, '2024-01-06', DATE_ADD('2024-01-06', INTERVAL 30 DAY)),
    (8, 2, '2024-01-07', DATE_ADD('2024-01-07', INTERVAL 30 DAY)),
    (9, 3, '2024-01-08', DATE_ADD('2024-01-08', INTERVAL 30 DAY)),
    (10, 4, '2024-01-09', DATE_ADD('2024-01-09', INTERVAL 30 DAY)),
    (11, 5, '2024-01-10', DATE_ADD('2024-01-10', INTERVAL 30 DAY)),
    (2, 2, '2024-03-01', DATE_ADD('2024-03-01', INTERVAL 30 DAY)),
    (3, 3, '2024-03-02', DATE_ADD('2024-03-02', INTERVAL 30 DAY)),
    (4, 4, '2024-03-03', DATE_ADD('2024-03-03', INTERVAL 30 DAY)),
    (5, 5, '2024-03-04', DATE_ADD('2024-03-04', INTERVAL 30 DAY)),
    (6, 2, '2024-03-05', DATE_ADD('2024-03-05', INTERVAL 30 DAY)),
    (7, 3, '2024-03-06', DATE_ADD('2024-03-06', INTERVAL 30 DAY)),
    (8, 4, '2024-03-07', DATE_ADD('2024-03-07', INTERVAL 30 DAY)),
    (9, 5, '2024-03-08', DATE_ADD('2024-03-08', INTERVAL 30 DAY)),
    (10, 2, '2024-03-09', DATE_ADD('2024-03-09', INTERVAL 30 DAY)),
    (11, 3, '2024-03-10', DATE_ADD('2024-03-10', INTERVAL 30 DAY)),
    (2, 4, '2024-05-01', DATE_ADD('2024-05-01', INTERVAL 30 DAY)),
    (3, 5, '2024-05-02', DATE_ADD('2024-05-02', INTERVAL 30 DAY)),
    (4, 2, '2024-05-03', DATE_ADD('2024-05-03', INTERVAL 30 DAY)),
    (5, 3, '2024-05-04', DATE_ADD('2024-05-04', INTERVAL 30 DAY)),
    (6, 4, '2024-05-05', DATE_ADD('2024-05-05', INTERVAL 30 DAY)),
    (7, 5, '2024-05-06', DATE_ADD('2024-05-06', INTERVAL 30 DAY)),
    (8, 2, '2024-05-07', DATE_ADD('2024-05-07', INTERVAL 30 DAY)),
    (9, 3, '2024-05-08', DATE_ADD('2024-05-08', INTERVAL 30 DAY)),
    (10, 4, '2024-05-09', DATE_ADD('2024-05-09', INTERVAL 30 DAY)),
    (11, 5, '2024-05-10', DATE_ADD('2024-05-10', INTERVAL 30 DAY));

-- Trainers
INSERT INTO trainers (last_name, first_name, birthdate, sex, phone_number, street, barangay, city, province, program_specialty, trainer_status)
VALUES
    ('N/A', 'N/A', '9999-01-01', 'N', '99999999999', 'N/A', 'N/A', 'N/A', 'N/A', 'N/A', 'Inactive'),
    ('Garcia', 'Carlos', '1985-04-12', 'M', '09171234567', '45 Main St', 'Barangay 1', 'City A', 'Province 1', 'Fitness & Weight Loss', 'Active'),
    ('Tan', 'Maria', '1990-07-25', 'F', '09182345678', '12 Oak Lane', 'Barangay 2', 'City B', 'Province 2', 'Yoga & Pilates', 'Active'),
    ('Rodriguez', 'Miguel', '1982-11-02', 'M', '09193456789', '88 Palm St', 'Barangay 3', 'City C', 'Province 3', 'Strength Training', 'Inactive'),
    ('Dela Cruz', 'Anna', '1995-01-18', 'F', '09204567890', '56 Birch Blvd', 'Barangay 4', 'City D', 'Province 4', 'Cardio & Endurance', 'Active'),
    ('Lim', 'John', '1988-09-05', 'M', '09215678901', '33 Pine Rd', 'Barangay 5', 'City E', 'Province 5', 'Martial Arts', 'Active'),
    ('Mendoza', 'Sophia', '1993-03-20', 'F', '09126789012', '23 Elm St', 'Barangay 6', 'City F', 'Province 6', 'Crossfit', 'Inactive'),
    ('Santos', 'Luis', '1980-12-01', 'M', '09237890123', '100 Maple Ave', 'Barangay 7', 'City G', 'Province 7', 'Personal Training', 'Active'),
    ('Chavez', 'Laura', '1997-06-15', 'F', '09134567890', '67 Cedar Ln', 'Barangay 8', 'City H', 'Province 8', 'Swimming & Water Sports', 'Active'),
    ('Perez', 'David', '1983-08-30', 'M', '09248901234', '90 Oak Blvd', 'Barangay 9', 'City I', 'Province 9', 'Functional Training', 'Inactive'),
    ('Cruz', 'Isabel', '1992-02-10', 'F', '09155678901', '72 Maple Rd', 'Barangay 10', 'City J', 'Province 10', 'Sports & Fitness', 'Active');

-- Training Sessions
INSERT INTO training_sessions (subscription_id, trainer_id, session_start_datetime, session_end_datetime)
VALUES
    (2, 2, '2023-11-01 13:01:00', '2023-11-01 14:01:00'),
    (3, 3, '2023-11-02 13:01:00', '2023-11-02 14:01:00'),
    (4, 4, '2023-11-03 13:01:00', '2023-11-03 14:01:00'),
    (5, 5, '2023-11-04 13:01:00', '2023-11-04 14:01:00'),
    (6, 6, '2023-11-05 13:01:00', '2023-11-05 14:01:00'),
    (7, 7, '2023-11-06 13:01:00', '2023-11-06 14:01:00'),
    (8, 8, '2023-11-07 13:01:00', '2023-11-07 14:01:00'),
    (9, 9, '2023-11-08 13:01:00', '2023-11-08 14:01:00'),
    (10, 10, '2023-11-09 13:01:00', '2023-11-09 14:01:00'),
    (11, 11, '2023-11-10 13:01:00', '2023-11-10 14:01:00'),
    (2, 2, '2024-01-01 13:01:00', '2024-01-01 14:01:00'),
    (3, 3, '2024-01-02 13:01:00', '2024-01-02 14:01:00'),
    (4, 4, '2024-01-03 13:01:00', '2024-01-03 14:01:00'),
    (5, 5, '2024-01-04 13:01:00', '2024-01-04 14:01:00'),
    (6, 6, '2024-01-05 13:01:00', '2024-01-05 14:01:00'),
    (7, 7, '2024-01-06 13:01:00', '2024-01-06 14:01:00'),
    (8, 8, '2024-01-07 13:01:00', '2024-01-07 14:01:00'),
    (9, 9, '2024-01-08 13:01:00', '2024-01-08 14:01:00'),
    (10, 10, '2024-01-09 13:01:00', '2024-01-09 14:01:00'),
    (11, 11, '2024-01-10 13:01:00', '2024-01-10 14:01:00'),
    (2, 2, '2024-03-01 13:01:00', '2024-03-01 14:01:00'),
    (3, 3, '2024-03-02 13:01:00', '2024-03-02 14:01:00'),
    (4, 4, '2024-03-03 13:01:00', '2024-03-03 14:01:00'),
    (5, 5, '2024-03-04 13:01:00', '2024-03-04 14:01:00'),
    (6, 6, '2024-03-05 13:01:00', '2024-03-05 14:01:00'),
    (7, 7, '2024-03-06 13:01:00', '2024-03-06 14:01:00'),
    (8, 8, '2024-03-07 13:01:00', '2024-03-07 14:01:00'),
    (9, 9, '2024-03-08 13:01:00', '2024-03-08 14:01:00'),
    (10, 10, '2024-03-09 13:01:00', '2024-03-09 14:01:00'),
    (11, 11, '2024-03-10 13:01:00', '2024-03-10 14:01:00'),
    (2, 2, '2024-05-01 13:01:00', '2024-05-01 14:01:00'),
    (3, 3, '2024-05-02 13:01:00', '2024-05-02 14:01:00'),
    (4, 4, '2024-05-03 13:01:00', '2024-05-03 14:01:00'),
    (5, 5, '2024-05-04 13:01:00', '2024-05-04 14:01:00'),
    (6, 6, '2024-05-05 13:01:00', '2024-05-05 14:01:00'),
    (7, 7, '2024-05-06 13:01:00', '2024-05-06 14:01:00'),
    (8, 8, '2024-05-07 13:01:00', '2024-05-07 14:01:00'),
    (9, 9, '2024-05-08 13:01:00', '2024-05-08 14:01:00'),
    (10, 10, '2024-05-09 13:01:00', '2024-05-09 14:01:00'),
    (11, 11, '2024-05-10 13:01:00', '2024-05-10 14:01:00');

-- Products
INSERT INTO products (product_brand, product_name, product_description, product_price, available_quantity)
VALUES
    ('N/A', 'N/A', 'N/A', 0, 0),
    ('Nike', 'Pro Training Shoes', 'High-performance training shoes for all workout types', 120.99 * 60, 50),
    ('Adidas', 'PowerLift Barbell', 'Durable barbell for heavy lifting exercises', 149.95 * 60, 30),
    ('Under Armour', 'Flex Fit Resistance Bands', 'Set of resistance bands for varied intensity workouts', 29.99 * 60, 75),
    ('Reebok', 'SpeedFlex Training Shorts', 'Breathable and lightweight shorts for intense training', 45.99 * 60, 60),
    ('Puma', 'Core Fitness Gloves', 'Grip-enhancing gloves for weight lifting', 24.99 * 60, 40),
    ('Bowflex', 'Adjustable Dumbbells', 'Space-saving adjustable dumbbells for at-home workouts', 399.99 * 60, 20),
    ('Tunturi', 'Weight Bench', 'Adjustable weight bench for full-body workouts', 199.99 * 60, 15),
    ('Life Fitness', 'Treadmill T5', 'Advanced treadmill with built-in heart rate monitor', 799.99 * 60, 10),
    ('ProForm', 'Elliptical Trainer', 'Low-impact elliptical machine for cardiovascular training', 599.99 * 60, 25),
    ('BodySolid', 'Power Rack', 'Heavy-duty rack for squats, deadlifts, and presses', 249.99 * 60, 12),
    ('Cap Barbell', 'Olympic Weight Plates', 'Olympic-sized weight plates for strength training', 89.99 * 60, 100),
    ('Harbinger', 'Lifting Straps', 'Heavy-duty lifting straps for enhanced grip during lifts', 14.99 * 60, 80),
    ('NordicTrack', 'Incline Trainer', 'Incline treadmill with adjustable elevation', 999.99 * 60, 5),
    ('VitaMaster', 'Kettlebells', 'Set of kettlebells for full-body workouts', 69.99 * 60, 40),
    ('Hyperice', 'Vyper 2.0 Vibrating Foam Roller', 'Vibrating foam roller for muscle recovery and flexibility', 179.99 * 60, 15),
    ('Schwinn', 'Stationary Bike', 'Indoor cycling bike for home workouts', 299.99 * 60, 18),
    ('Sole Fitness', 'Sole F63 Treadmill', 'High-quality treadmill with 10 workout programs', 899.99 * 60, 12),
    ('TRX', 'Suspension Trainer', 'Portable suspension trainer for bodyweight workouts', 199.99 * 60, 30),
    ('Exerpeutic', 'Recumbent Bike', 'Comfortable recumbent bike for low-impact cardio workouts', 149.99 * 60, 35),
    ('Peloton', 'Exercise Mat', 'Non-slip exercise mat for yoga, pilates, and stretching', 39.99 * 60, 50),
    ('Tone Fitness', 'Ab Roller', 'Compact ab roller for core workouts', 19.99 * 60, 70),
    ('Stamina', 'Air Rower', 'Rowing machine for full-body cardio workouts', 379.99 * 60, 25),
    ('PowerBlock', 'Adjustable Kettlebells', 'Adjustable kettlebell for variable weight training', 149.99 * 60, 20),
    ('ProMaxima', 'Smith Machine', 'Smith machine with adjustable bar for safe weight lifting', 799.99 * 60, 10),
    ('Gaiam', 'Balance Ball', 'Stability ball for core strengthening and balance exercises', 24.99 * 60, 60),
    ('Marcy', 'Multi-Function Home Gym', 'All-in-one home gym machine for a variety of exercises', 399.99 * 60, 8),
    ('Total Gym', 'Full Body Workout System', 'Versatile home gym system for total body workouts', 499.99 * 60, 18);

-- Product Purchases
INSERT INTO product_purchases (member_id, product_id, quantity_sold, purchase_datetime)
VALUES
	(2, 5, 3, '2023-11-05 14:32:10'),
	(3, 3, 7, '2023-11-06 08:45:23'),
	(4, 10, 2, '2023-11-07 09:12:34'),
	(5, 14, 5, '2023-11-08 10:50:56'),
	(6, 20, 1, '2023-11-10 11:27:19'),
	(7, 7, 8, '2023-11-12 12:33:45'),
	(8, 15, 4, '2023-11-13 13:16:55'),
	(9, 2, 10, '2023-11-14 15:42:01'),
	(10, 9, 3, '2023-11-15 16:25:18'),
	(11, 17, 6, '2023-11-16 17:57:30'),
	(2, 13, 9, '2023-11-18 18:49:42'),
	(3, 4, 2, '2023-11-20 19:16:59'),
	(4, 19, 3, '2023-11-21 20:25:11'),
	(5, 6, 12, '2023-11-23 21:33:57'),
	(6, 11, 4, '2023-11-24 22:44:20'),
	(7, 25, 5, '2023-11-25 23:50:33'),
	(8, 18, 6, '2023-11-26 08:35:47'),
	(9, 12, 7, '2023-11-27 09:42:13'),
	(10, 2, 10, '2023-11-28 10:58:22'),
	(11, 22, 3, '2023-11-29 11:19:41'),
	(2, 16, 8, '2023-12-01 12:26:58'),
	(3, 24, 5, '2023-12-02 13:31:37'),
	(4, 8, 4, '2023-12-03 14:45:51'),
	(5, 26, 2, '2023-12-04 15:10:20'),
	(6, 23, 1, '2023-12-06 16:05:43'),
	(7, 27, 9, '2023-12-07 17:22:14'),
	(8, 5, 6, '2023-12-08 18:28:36'),
	(9, 21, 3, '2023-12-09 19:44:07'),
	(10, 10, 4, '2023-12-10 20:33:50'),
	(11, 4, 7, '2023-12-12 21:39:12'),
	(2, 14, 6, '2023-12-13 22:57:31'),
	(3, 20, 5, '2023-12-15 08:10:42'),
	(4, 11, 3, '2023-12-16 09:15:06'),
	(5, 18, 2, '2023-12-17 10:42:31'),
	(6, 2, 10, '2023-12-18 11:05:23'),
	(7, 3, 8, '2023-12-20 12:13:40'),
	(8, 7, 1, '2023-12-21 13:42:50'),
	(9, 15, 4, '2023-12-22 14:29:34'),
	(10, 22, 6, '2023-12-23 15:41:12'),
	(11, 19, 5, '2023-12-25 16:58:29'),
	(2, 2, 3, '2023-12-26 17:15:42'),
	(3, 23, 7, '2023-12-28 18:32:58'),
	(4, 6, 2, '2023-12-29 19:44:13'),
	(5, 9, 9, '2023-12-30 20:16:40'),
	(6, 12, 6, '2024-01-02 21:03:10'),
	(7, 27, 4, '2024-01-03 22:22:47'),
	(8, 8, 10, '2024-01-05 08:40:19'),
	(9, 21, 1, '2024-01-06 09:18:38'),
	(10, 5, 8, '2024-01-07 10:36:50'),
	(11, 17, 6, '2024-01-08 11:11:19'),
	(2, 16, 4, '2023-11-02 12:33:10'),
	(3, 4, 3, '2023-11-03 13:17:25'),
	(4, 22, 7, '2023-11-04 14:01:45'),
	(5, 6, 8, '2023-11-06 15:48:10'),
	(6, 10, 5, '2023-11-07 16:25:30'),
	(7, 2, 3, '2023-11-09 17:14:58'),
	(8, 19, 6, '2023-11-10 18:30:41'),
	(9, 14, 2, '2023-11-11 19:20:09'),
	(10, 25, 4, '2023-11-12 20:47:54'),
	(11, 13, 5, '2023-11-14 21:39:31'),
	(2, 21, 1, '2023-11-15 22:11:18'),
	(3, 23, 6, '2023-11-17 08:24:05'),
	(4, 9, 3, '2023-11-18 09:14:30'),
	(5, 18, 10, '2023-11-19 10:35:47'),
	(6, 2, 5, '2023-11-20 11:02:55'),
	(7, 5, 7, '2023-11-22 12:56:20'),
	(8, 8, 2, '2023-11-23 13:18:44'),
	(9, 24, 9, '2023-11-24 14:40:25'),
	(10, 12, 4, '2023-11-26 15:31:03'),
	(11, 20, 3, '2023-11-27 16:43:19'),
	(2, 17, 6, '2023-11-28 17:12:50'),
	(3, 26, 4, '2023-11-30 18:35:42'),
	(4, 7, 5, '2023-12-01 19:44:09'),
	(5, 19, 2, '2023-12-02 20:11:38'),
	(6, 11, 6, '2023-12-03 21:56:01'),
	(7, 27, 3, '2023-12-05 08:22:55'),
	(8, 3, 7, '2023-12-06 09:30:14'),
	(9, 4, 5, '2023-12-07 10:15:47'),
	(10, 10, 6, '2023-12-09 11:22:28'),
	(11, 15, 3, '2023-12-10 12:56:50'),
	(2, 12, 8, '2023-12-11 13:41:37'),
	(3, 21, 2, '2023-12-13 14:18:52'),
	(4, 14, 5, '2023-12-14 15:12:36'),
	(5, 16, 1, '2023-12-15 16:32:19'),
	(6, 6, 10, '2023-12-16 17:27:06'),
	(7, 22, 4, '2023-12-17 18:04:39'),
	(8, 23, 3, '2023-12-19 19:10:13'),
	(9, 13, 9, '2023-12-20 20:21:45'),
	(10, 5, 7, '2023-12-21 21:34:28'),
	(11, 8, 4, '2023-12-23 08:45:59'),
	(2, 9, 3, '2023-12-24 09:58:27'),
	(3, 25, 6, '2023-12-25 11:13:05'),
	(4, 20, 5, '2023-12-26 12:34:42'),
	(5, 2, 7, '2023-12-27 13:26:14'),
	(6, 17, 2, '2023-12-29 14:50:30'),
	(7, 27, 5, '2023-12-30 15:12:58'),
	(8, 2, 8, '2024-01-01 16:23:47'),
	(9, 18, 6, '2024-01-02 17:02:38'),
	(10, 4, 7, '2024-01-03 18:15:56'),
	(11, 10, 3, '2024-01-05 19:38:10');
