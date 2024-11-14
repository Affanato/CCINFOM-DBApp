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
  `sex` ENUM('M', 'F', '-') NULL,
  `phone_number` CHAR(11) NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  `barangay` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `province` VARCHAR(45) NULL,
  PRIMARY KEY (`member_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`membership_types`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`membership_types` (
  `membership_type_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `membership_type_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`membership_type_id`),
  UNIQUE INDEX `membership_type_UNIQUE` (`membership_type_name` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`trainers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`trainers` (
  `trainer_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `last_name` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `birthdate` DATE NOT NULL,
  `sex` ENUM('M', 'F', '-') NOT NULL,
  `phone_number` CHAR(11) NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  `barangay` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `province` VARCHAR(45) NULL,
  `program_specialty` VARCHAR(45) NOT NULL,
  `availability_schedule` VARCHAR(14) NOT NULL,
  `work_start_date` DATE NOT NULL,
  `work_end_date` DATE NOT NULL,
  PRIMARY KEY (`trainer_id`),
  UNIQUE INDEX `phone_number_UNIQUE` (`phone_number` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`memberships`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`memberships` (
  `membership_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `member_id` INT UNSIGNED NOT NULL,
  `membership_type_id` INT UNSIGNED NOT NULL,
  `trainer_id` INT UNSIGNED NOT NULL,
  `membership_start_date` DATE NOT NULL,
  `membership_end_date` DATE NOT NULL,
  PRIMARY KEY (`membership_id`),
  INDEX `fk_memberships_members1_idx` (`member_id` ASC) VISIBLE,
  INDEX `fk_memberships_membership_types1_idx` (`membership_type_id` ASC) VISIBLE,
  INDEX `fk_memberships_trainers1_idx` (`trainer_id` ASC) VISIBLE,
  CONSTRAINT `fk_memberships_members1`
    FOREIGN KEY (`member_id`)
    REFERENCES `dbgym`.`members` (`member_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_memberships_membership_types1`
    FOREIGN KEY (`membership_type_id`)
    REFERENCES `dbgym`.`membership_types` (`membership_type_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_memberships_trainers1`
    FOREIGN KEY (`trainer_id`)
    REFERENCES `dbgym`.`trainers` (`trainer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`products` (
  `product_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `product_brand` VARCHAR(45) NOT NULL,
  `product_name` VARCHAR(45) NOT NULL,
  `product_description` VARCHAR(45) NULL,
  `product_price` DECIMAL(10,2) UNSIGNED NOT NULL,
  `available_quantity` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`product_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`transactions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`transactions` (
  `transaction_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `member_id` INT UNSIGNED NOT NULL,
  `product_id` INT UNSIGNED NOT NULL,
  `quantity_sold` INT UNSIGNED NOT NULL,
  `transaction_date` DATE NOT NULL,
  PRIMARY KEY (`transaction_id`),
  INDEX `fk_transactions_members1_idx` (`member_id` ASC) VISIBLE,
  INDEX `fk_transactions_products1_idx` (`product_id` ASC) VISIBLE,
  CONSTRAINT `fk_transactions_members1`
    FOREIGN KEY (`member_id`)
    REFERENCES `dbgym`.`members` (`member_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_transactions_products1`
    FOREIGN KEY (`product_id`)
    REFERENCES `dbgym`.`products` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`amenities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`amenities` (
  `amenity_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `amenity_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`amenity_id`),
  UNIQUE INDEX `amenity_name_UNIQUE` (`amenity_name` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbgym`.`membership_type_amenities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbgym`.`membership_type_amenities` (
  `membership_type_id` INT UNSIGNED NOT NULL,
  `amenity_id` INT UNSIGNED NOT NULL,
  INDEX `fk_membership_type_amenities_membership_types1_idx` (`membership_type_id` ASC) VISIBLE,
  INDEX `fk_membership_type_amenities_amenities1_idx` (`amenity_id` ASC) VISIBLE,
  CONSTRAINT `fk_membership_type_amenities_membership_types1`
    FOREIGN KEY (`membership_type_id`)
    REFERENCES `dbgym`.`membership_types` (`membership_type_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_membership_type_amenities_amenities1`
    FOREIGN KEY (`amenity_id`)
    REFERENCES `dbgym`.`amenities` (`amenity_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
