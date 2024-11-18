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
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_subscriptions_members1`
    FOREIGN KEY (`member_id`)
    REFERENCES `dbgym`.`members` (`member_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
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
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_product_purchases_members1`
    FOREIGN KEY (`member_id`)
    REFERENCES `dbgym`.`members` (`member_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
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
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_subscription_type_amenities_amenities1`
    FOREIGN KEY (`amenity_id`)
    REFERENCES `dbgym`.`amenities` (`amenity_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
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
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_amenity_logs_amenities1`
    FOREIGN KEY (`amenity_id`)
    REFERENCES `dbgym`.`amenities` (`amenity_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
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
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_training_sessions_subscriptions1`
    FOREIGN KEY (`subscription_id`)
    REFERENCES `dbgym`.`subscriptions` (`subscription_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
